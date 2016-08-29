/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

/**
 *
 * @author phd2014
 */

public class existeCampo {
    
    public static boolean existeCampo(String json,String palabra){   
        return json.toLowerCase().contains(palabra.toLowerCase()); //REVISA SI UNA CADENA ESTA DENTRO DE OTRA
    }    
}