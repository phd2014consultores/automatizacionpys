/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

import ve.gob.mercal.app.services.wsQuery;

/**
 *
 * @author phd2014
 */
public class obtenerParametros {
    private static Parametros param = new Parametros();
    private static String result = "";
    
    public static Parametros obtenerParametros(){
        try{
            result = wsQuery.queryapp("");
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //AQUI IRAN TODOS LOS SET DE LOS PARAMETROS..
        return param;
    }
}
