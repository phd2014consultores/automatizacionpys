/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 *
 * @author phd2014
 */
public class cargasMAX {
    
    private static int max = 6;
    private static String  result = "";
    private static int newMax;
    
    public static void setcargasMAX(){
        try{
            result = wsQuery.queryapp("SELECT json_config FROM public.config WHERE elemento ='cluster';");
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
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
            }
        }
        
    }
    
    public static int getcargasMAX(){
        return max;
    }
}
