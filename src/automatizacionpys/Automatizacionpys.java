/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import static java.lang.Thread.sleep;
import ve.gob.mercal.app.services.Servicio;
import ve.gob.mercal.app.services.cargasMAX;
import static ve.gob.mercal.app.services.detenerProceso.detenerProceso;
import ve.gob.mercal.app.services.procesosEjecutandose;

/**
 *
 * @author phd2014
 */
public class Automatizacionpys {

    /**
     * @param args the command line arguments
     */
    static Logger log = Logger.getLogger(Automatizacionpys.class.getName());
    
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        int result = -999;
        int time = 5;       
        PropertyConfigurator.configure("/home/phd2014/NetBeansProjects/automatizacionpys/src/automatizacionpys/log4j.properties");
        log.info("Iniciando el proceso de Automatización");
        if(args[0].equals("start")){           
            while(true){
                cargasMAX.setcargasMAX(); //REVISO EN LA BD LA CANTIDAD MAXIMA DE PROCESOS
                max= cargasMAX.getcargasMAX();//OBTENGO LA CANTIDAD MAXIMA DE PROCESOS
                if (procesosEjecutandose.procesosEjecutandose() <= max){ //VERIFICO NUMERO DE PROCESOS EN EJECUCION
                    log.info("Existe disponibilidad para una nueva ejecución");
                    Parametros param;
                    param = obtenerParametros.obtenerParametros();//OBTENER PARAMETROS Y EJECUTAR EL JOB
                    switch (param.getTipo()) {
                        case "INICIAR_CARGA":
                            try {
                                result = Servicio.cargainicial(param.getDirPDI(),param.getNombreJob(),
                                        param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                        param.getPassusuarioRepo(),param.getHostbdOracle(),param.getUsuariobdOracle(),
                                        param.getPassusuariobdOracle(),param.getBdOracle(),param.getHostbdCassandra(),
                                        param.getColumnFamily(),param.getKeyspace(),param.getHostbdApp(),
                                        param.getUsuariobdApp(),param.getPassusuariobdApp(),param.getBdApp(),
                                        param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),param.getNivelLogs());
                                if(result == 0 ){
                                    log.info("Se inicio un proceso de Carga Inicial");
                                }
                            } catch (Exception e) {
                                log.error("Excepción en Carga Inicial :");
                                log.error(e);

                            }
                        break;
                        case "INICIAR_CARGA_ETL":
                            try {
                                result = Servicio.cargainicialetl(param.getDirPDI(),param.getNombreJob(),
                                        param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                        param.getPassusuarioRepo(),param.getTransformaciones(),param.getHostbdOracle(),
                                        param.getUsuariobdOracle(),param.getPassusuariobdOracle(),param.getBdOracle(),
                                        param.getHostbdCassandra(),param.getColumnFamily(),param.getKeyspace(),
                                        param.getHostbdApp(),param.getUsuariobdApp(),param.getPassusuariobdApp(),
                                        param.getBdApp(),param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),
                                        param.getNivelLogs());
                                if(result == 0 ){
                                    log.info("Se inicio un proceso de Carga Inicial ETL");
                                }
                            } catch (Exception e) {
                                log.error("Excepción en Carga Inicial ETL :");
                                log.error(e);
                            }
                        break;
                        case "INICIAR_MEDIACION":
                            try {
                                result = Servicio.mediacion(param.getDirPDI(),param.getNombreJob(),
                                        param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                        param.getPassusuarioRepo(),param.getHostbdOracle(),param.getUsuariobdOracle(),
                                        param.getPassusuariobdOracle(),param.getBdOracle(),param.getHostbdCassandra(),
                                        param.getColumnFamily(),param.getKeyspace(),param.getHostbdApp(),
                                        param.getUsuariobdApp(),param.getPassusuariobdApp(),param.getBdApp(),
                                        param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),param.getNivelLogs());
                                if(result == 0 ){
                                    log.info("Se inicio un proceso de Mediación");
                                }
                            } catch (Exception e) {
                                log.error("Excepción en Mediación :");
                                log.error(e);
                            }
                        break;
                        case "INICIAR_MEDIACION_ETL":
                            try {
                                result = Servicio.mediacionetl(param.getDirPDI(),param.getNombreJob(),
                                        param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                        param.getPassusuarioRepo(),param.getTransformaciones(),param.getHostbdOracle(),
                                        param.getUsuariobdOracle(),param.getPassusuariobdOracle(),param.getBdOracle(),
                                        param.getHostbdCassandra(),param.getColumnFamily(),param.getKeyspace(),
                                        param.getHostbdApp(),param.getUsuariobdApp(),param.getPassusuariobdApp(),
                                        param.getBdApp(),param.getIdplanEjec(),param.getJobModo(),param.getTimestampIni(),
                                        param.getTimestampFin(),param.getDirLogs(),param.getNivelLogs());
                            if(result == 0 ){
                                    log.info("Se inicio un proceso de Mediación ETL");
                                }
                            } catch (Exception e) {
                                log.error("Excepción en Mediación ETL :");
                                log.error(e);
                            }
                        break;
                    }
                    try {
                        sleep(2000);
                    } catch (Exception e) {
                        log.error("Excepción durmiendo ejecución");
                        log.error(e);
                    }    
                }else{
                    if(!args[1].equals(null)){
                        log.info("El tiempo maximo de espera asignado es: " + args[1]+" minutos");
                        time = Integer.parseInt(args[1]);
                    }                  
                    time = time * 60000;
                    try {
                        sleep(time); //DUERMO LA EJECUCION DURANTE 'TIME' MINUTOS
                    } catch (Exception e) {
                        log.error("Excepción durmiendo ejecución");
                        log.error(e);
                    }      
                }      
            } 
        }else{
            if(args[0].equals("stop")){
                log.info("Detener Proceso ha sido Iniciado");
                detenerProceso();             
            }
        }
    }  
}
