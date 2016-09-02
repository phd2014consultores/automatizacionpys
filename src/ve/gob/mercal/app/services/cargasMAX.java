/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

import automatizacionpys.Automatizacionpys;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author phd2014
 */
public class cargasMAX {
    
    static Logger log = Logger.getLogger(Automatizacionpys.class.getName());
    private static int max = 2;
    private static String  result = "";
    private static int newMax;
    
    public static void setcargasMAX(){
        PropertyConfigurator.configure("/home/phd2014/NetBeansProjects/automatizacionpys/src/automatizacionpys/log4j.properties");
        
        try{
            result = Servicio.queryapp("SELECT json_config FROM public.config WHERE elemento ='cluster';");
            
            if(existeCampo.existeCampo(result,"max_cargas_paralelas")){
                result = result.substring(1, result.length()-1);
                JsonParser parser = new JsonParser();
                JsonElement elementObject;
                elementObject = parser.parse(result);                   
                result = elementObject.getAsJsonObject().get("json_config").getAsString();
                elementObject = parser.parse(result);
                newMax = elementObject.getAsJsonObject().get("max_cargas_paralelas").getAsInt();
                if(max != newMax){
                    max = newMax;
                    log.info("Se actualizó un nuevo valor para el máximo de cargas");
                }
                log.info("El valor máximo de carga es: "+max);
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            log.error("Excepción obteniendo cargas máximas :");
            log.error(e);
        }

        
    }
    
    public static int getcargasMAX(){
        return max;
    }
}
