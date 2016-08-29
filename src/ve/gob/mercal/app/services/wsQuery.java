/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ve.gob.mercal.app.services;

import ve.gob.mercal.ws.ExcepcionServicio_Exception;

/**
 *
 * @author phd2014
 */
public class wsQuery {
    //EJECUTA UNA CONSULTA EN LA BASE DE DATOS
    public static String queryapp(java.lang.String query) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.QueryAppService service = new ve.gob.mercal.ws.QueryAppService();
        ve.gob.mercal.ws.QueryApp port = service.getQueryAppPort();
        return port.queryapp(query);
    }
}
