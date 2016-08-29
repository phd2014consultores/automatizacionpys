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
public class Servicio {
    //EJECUTA UNA CONSULTA EN LA BASE DE DATOS
    public static String queryapp(java.lang.String query) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.QueryAppService service = new ve.gob.mercal.ws.QueryAppService();
        ve.gob.mercal.ws.QueryApp port = service.getQueryAppPort();
        return port.queryapp(query);
    }

    private static int cargainicial(java.lang.String dirPDI, java.lang.String nombreJob, java.lang.String dirEjecucion, java.lang.String repositorio, java.lang.String usuarioRepositorio, java.lang.String passUsuarioRepo, java.lang.String hostBDOracle, java.lang.String usuarioBDOracle, java.lang.String passUsuarioBDOracle, java.lang.String bdOracle, java.lang.String hostBDCassandra, java.lang.String colummFamily, java.lang.String keySpace, java.lang.String hostBDApp, java.lang.String usuarioBDApp, java.lang.String passUsuarioBDApp, java.lang.String bdApp, java.lang.String idPlanEjec, java.lang.String jobModo, java.lang.String dirLogs, java.lang.String nivelLogs) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.CargaInicialService service = new ve.gob.mercal.ws.CargaInicialService();
        ve.gob.mercal.ws.CargaInicial port = service.getCargaInicialPort();
        return port.cargainicial(dirPDI, nombreJob, dirEjecucion, repositorio, usuarioRepositorio, passUsuarioRepo, hostBDOracle, usuarioBDOracle, passUsuarioBDOracle, bdOracle, hostBDCassandra, colummFamily, keySpace, hostBDApp, usuarioBDApp, passUsuarioBDApp, bdApp, idPlanEjec, jobModo, dirLogs, nivelLogs);
    }

    private static int cargainicialetl(java.lang.String dirPDI, java.lang.String nombreJob, java.lang.String dirEjecucion, java.lang.String repositorio, java.lang.String usuarioRepositorio, java.lang.String passUsuarioRepo, java.lang.String transformaciones, java.lang.String hostBDOracle, java.lang.String usuarioBDOracle, java.lang.String passUsuarioBDOracle, java.lang.String bdOracle, java.lang.String hostBDCassandra, java.lang.String colummFamily, java.lang.String keySpace, java.lang.String hostBDApp, java.lang.String usuarioBDApp, java.lang.String passUsuarioBDApp, java.lang.String bdApp, java.lang.String idPlanEjec, java.lang.String jobModo, java.lang.String dirLogs, java.lang.String nivelLogs) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.CargaInicialEtlService service = new ve.gob.mercal.ws.CargaInicialEtlService();
        ve.gob.mercal.ws.CargaInicialEtl port = service.getCargaInicialEtlPort();
        return port.cargainicialetl(dirPDI, nombreJob, dirEjecucion, repositorio, usuarioRepositorio, passUsuarioRepo, transformaciones, hostBDOracle, usuarioBDOracle, passUsuarioBDOracle, bdOracle, hostBDCassandra, colummFamily, keySpace, hostBDApp, usuarioBDApp, passUsuarioBDApp, bdApp, idPlanEjec, jobModo, dirLogs, nivelLogs);
    }

    private static int mediacionetl(java.lang.String dirPDI, java.lang.String nombreJob, java.lang.String dirEjecucion, java.lang.String repositorio, java.lang.String usuarioRepositorio, java.lang.String passUsuarioRepo, java.lang.String transformaciones, java.lang.String hostBDOracle, java.lang.String usuarioBDOracle, java.lang.String passUsuarioBDOracle, java.lang.String bdOracle, java.lang.String hostBDCassandra, java.lang.String colummFamily, java.lang.String keySpace, java.lang.String hostBDApp, java.lang.String usuarioBDApp, java.lang.String passUsuarioBDApp, java.lang.String bdApp, java.lang.String idPlanEjec, java.lang.String jobModo, java.lang.String timestampIni, java.lang.String timestampFin, java.lang.String dirLogs, java.lang.String nivelLogs) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.MediacionEtlService service = new ve.gob.mercal.ws.MediacionEtlService();
        ve.gob.mercal.ws.MediacionEtl port = service.getMediacionEtlPort();
        return port.mediacionetl(dirPDI, nombreJob, dirEjecucion, repositorio, usuarioRepositorio, passUsuarioRepo, transformaciones, hostBDOracle, usuarioBDOracle, passUsuarioBDOracle, bdOracle, hostBDCassandra, colummFamily, keySpace, hostBDApp, usuarioBDApp, passUsuarioBDApp, bdApp, idPlanEjec, jobModo, timestampIni, timestampFin, dirLogs, nivelLogs);
    }

    private static int mediacion(java.lang.String dirPDI, java.lang.String nombreJob, java.lang.String dirEjecucion, java.lang.String repositorio, java.lang.String usuarioRepositorio, java.lang.String passUsuarioRepo, java.lang.String hostBDOracle, java.lang.String usuarioBDOracle, java.lang.String passUsuarioBDOracle, java.lang.String bdOracle, java.lang.String hostBDCassandra, java.lang.String colummFamily, java.lang.String keySpace, java.lang.String hostBDApp, java.lang.String usuarioBDApp, java.lang.String passUsuarioBDApp, java.lang.String bdApp, java.lang.String idPlanEjec, java.lang.String jobModo, java.lang.String dirLogs, java.lang.String nivelLogs) throws ExcepcionServicio_Exception {
        ve.gob.mercal.ws.MediacionService service = new ve.gob.mercal.ws.MediacionService();
        ve.gob.mercal.ws.Mediacion port = service.getMediacionPort();
        return port.mediacion(dirPDI, nombreJob, dirEjecucion, repositorio, usuarioRepositorio, passUsuarioRepo, hostBDOracle, usuarioBDOracle, passUsuarioBDOracle, bdOracle, hostBDCassandra, colummFamily, keySpace, hostBDApp, usuarioBDApp, passUsuarioBDApp, bdApp, idPlanEjec, jobModo, dirLogs, nivelLogs);
    }

}
