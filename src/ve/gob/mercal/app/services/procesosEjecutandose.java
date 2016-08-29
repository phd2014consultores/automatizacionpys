/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author phd2014
 */
public class procesosEjecutandose {
    private static int cant=0;
    public static int procesosEjecutandose(){
        try{
            Process p = Runtime.getRuntime().exec(new String[] { "bash", "-c", "ps -C job -o pid=" });
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while (input.readLine() != null) //CUENTO LA CANTIDAD DE PROCESOS EN EJECUCION
            {
                cant++; 
            }
        }catch (Exception e){
            System.err.println(e);
        }
        return cant-1;//RESTO EL VALOR DEL PROCESO GREP ADICIONAL
    }
        
}
