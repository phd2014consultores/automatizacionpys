/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

import ve.gob.mercal.app.services.Servicio;

/**
 *
 * @author phd2014
 */
public class obtenerParametros {
    private static Parametros param = new Parametros();
    private static String pdi = "";
    private static String cluster = "";
    private static String db_pys = "";
    private static String tienda = "";
    
    public static Parametros obtenerParametros(){
        try{
            pdi = Servicio.queryapp("");
            cluster = Servicio.queryapp("");
            db_pys = Servicio.queryapp("");
            tienda = Servicio.queryapp("");
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //AQUI IRAN TODOS LOS SET DE LOS PARAMETROS..
        
        return param;
    }
}
