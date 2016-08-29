/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

//import ve.gob.mercal.ws.ExcepcionServicio_Exception;

import static java.lang.Thread.sleep;
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
                                //instrucciones;
                            break;

                            case "CargaInicialEtl":
                                //instrucciones;
                            break;

                            case "Mediacion":
                                //instrucciones;
                            break;

                            case "MediacionEtl":
                                //instrucciones;
                            break;
                        }
                    }else{
                        try {
                            sleep(300000); //DUERMO LA EJECUCION DURANTE 5 MINUTOS
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
