/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

//import ve.gob.mercal.ws.ExcepcionServicio_Exception;

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

    
    public static void main(String[] args) {
        // TODO code application logic here
        int max = 0;
        int result = -999;
        if(args.length > 1){
            if(args[0].equals("start")){           
                while(true){
                    cargasMAX.setcargasMAX(); //REVISO EN LA BD LA CANTIDAD MAXIMA DE PROCESOS
                    max= cargasMAX.getcargasMAX();//OBTENGO LA CANTIDAD MAXIMA DE PROCESOS
                    if (procesosEjecutandose.procesosEjecutandose() < max){ //VERIFICO NUMERO DE PROCESOS EN EJECUCION
                        Parametros param;
                        param = obtenerParametros.obtenerParametros();//OBTENER PARAMETROS Y EJECUTAR EL JOB
                        switch (param.getTipo()) {
 
                            case "CargaInicial":
                                try {
                                    result = Servicio.cargainicial(param.getDirPDI(),param.getNombreJob(),
                                            param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                            param.getPassusuarioRepo(),param.getHostbdOracle(),param.getUsuariobdOracle(),
                                            param.getPassusuariobdOracle(),param.getBdOracle(),param.getHostbdCassandra(),
                                            param.getColumnFamily(),param.getKeyspace(),param.getHostbdApp(),
                                            param.getUsuariobdApp(),param.getPassusuariobdApp(),param.getBdApp(),
                                            param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),param.getNivelLogs());
                                } catch (Exception e) {
                                    System.err.println(e);
                                }
                            break;

                            case "CargaInicialEtl":
                                try {
                                    result = Servicio.cargainicialetl(param.getDirPDI(),param.getNombreJob(),
                                            param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                            param.getPassusuarioRepo(),param.getTransformaciones(),param.getHostbdOracle(),
                                            param.getUsuariobdOracle(),param.getPassusuariobdOracle(),param.getBdOracle(),
                                            param.getHostbdCassandra(),param.getColumnFamily(),param.getKeyspace(),
                                            param.getHostbdApp(),param.getUsuariobdApp(),param.getPassusuariobdApp(),
                                            param.getBdApp(),param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),
                                            param.getNivelLogs());
                                } catch (Exception e) {
                                    System.err.println(e);
                                }
                            break;

                            case "Mediacion":
                                try {
                                    result = Servicio.mediacion(param.getDirPDI(),param.getNombreJob(),
                                            param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                            param.getPassusuarioRepo(),param.getHostbdOracle(),param.getUsuariobdOracle(),
                                            param.getPassusuariobdOracle(),param.getBdOracle(),param.getHostbdCassandra(),
                                            param.getColumnFamily(),param.getKeyspace(),param.getHostbdApp(),
                                            param.getUsuariobdApp(),param.getPassusuariobdApp(),param.getBdApp(),
                                            param.getIdplanEjec(),param.getJobModo(),param.getDirLogs(),param.getNivelLogs());
                                } catch (Exception e) {
                                    System.err.println(e);
                                }

                            case "MediacionEtl":
                                try {
                                    result = Servicio.mediacionetl(param.getDirPDI(),param.getNombreJob(),
                                            param.getDirEjecucion(),param.getRepositorio(),param.getUsuarioRepositorio(),
                                            param.getPassusuarioRepo(),param.getTransformaciones(),param.getHostbdOracle(),
                                            param.getUsuariobdOracle(),param.getPassusuariobdOracle(),param.getBdOracle(),
                                            param.getHostbdCassandra(),param.getColumnFamily(),param.getKeyspace(),
                                            param.getHostbdApp(),param.getUsuariobdApp(),param.getPassusuariobdApp(),
                                            param.getBdApp(),param.getIdplanEjec(),param.getJobModo(),param.getTimestampIni(),
                                            param.getTimestampFin(),param.getDirLogs(),param.getNivelLogs());
                                } catch (Exception e) {
                                    System.err.println(e);
                                }
                            break;
                        }
                    }else{
                        int time = 0;
                        time = Integer.parseInt(args[1]);
                        time = time * 60000;
                        try {
                            sleep(time); //DUERMO LA EJECUCION DURANTE 'TIME' MINUTOS
                        } catch (Exception e) {
                            System.err.println(e);
                        }      
                    }      
                } 
            }else{
                if(args[0].equals("stop")){
                    detenerProceso();
                }
            }       
        }
    }  
}
