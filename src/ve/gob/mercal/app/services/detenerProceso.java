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
public class detenerProceso {
    private static int cant=0;
    private static String proceso= "";
    public static void detenerProceso(){
        try{
            Process p = Runtime.getRuntime().exec(new String[] { "bash", "-c", "ps -C automatizacionpys -o pid=" });
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((proceso=input.readLine()) != null) //CUENTO LA CANTIDAD DE PROCESOS EN EJECUCION
            {
                Runtime.getRuntime().exec(new String[] { "bash", "-c", "kill -9 "+proceso });
            }
        }catch (Exception e){
            System.err.println(e);
        }
    }
}
