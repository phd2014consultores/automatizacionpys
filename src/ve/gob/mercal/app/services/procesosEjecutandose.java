/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static ve.gob.mercal.app.services.cargasMAX.log;

/**
 *
 * @author phd2014
 */
public class procesosEjecutandose {
    private static int cant=0;
    public static int procesosEjecutandose(){
        cant = 0;
        try{
            Process p = Runtime.getRuntime().exec(new String[] { "bash", "-c", "ps -x | grep automatizacionpys" });
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (input.readLine() != null) //CUENTO LA CANTIDAD DE PROCESOS EN EJECUCION
            {
                cant++;   
            }
        }catch (Exception e){
            log.error("Excepción obteniendo procesos ejecutandose :");
            log.error(e);
        }
        cant = cant-2;
        log.info("Existen "+cant+" procesos ejecutandose actualmente");
        return cant;//RESTO EL VALOR DEL PROCESO GREP ADICIONAL
    }
        
}
