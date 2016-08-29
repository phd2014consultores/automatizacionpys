/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

//import ve.gob.mercal.ws.ExcepcionServicio_Exception;

import static java.lang.Thread.sleep;
import ve.gob.mercal.app.services.cargasMAX;
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

        while(true){
            cargasMAX.setcargasMAX();
            max= cargasMAX.getcargasMAX();
            if (procesosEjecutandose.procesosEjecutandose() < max){
                Parametros param;
                //OBTENER PARAMETROS Y EJECUTAR EL JOB
                param = obtenerParametros.obtenerParametros();
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
                    sleep(300000);
                } catch (Exception e) {
                    System.err.println(e);
                }      
            }      
        }   
    }  
}
