/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

//import ve.gob.mercal.ws.ExcepcionServicio_Exception;

import ve.gob.mercal.ws.ExcepcionServicio_Exception;


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
        String result = "mundo";
        try {
            result = queryapp("SELECT id_usuario FROM public.usuarios WHERE usuario= 'admin';");
        } catch (Exception e) {
            System.err.println(e);
        }
        
        System.out.println("hola "+result);
    }  

    private static String queryapp(java.lang.String query) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.QueryAppService service = new ve.gob.mercal.ws.QueryAppService();
        ve.gob.mercal.ws.QueryApp port = service.getQueryAppPort();
        return port.queryapp(query);
    }
}
