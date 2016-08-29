/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatizacionpys;

/**
 *
 * @author phd2014
 */
public class Parametros {
    private String dirPDI;
    private String nombreJob;
    private String dirEjecucion;
    private String repositorio;
    private String usuarioRepositorio;
    private String passusuarioRepo;
    private String transformaciones;
    private String hostbdOracle;
    private String usuariobdOracle;
    private String passusuariobdOracle;
    private String bdOracle;
    private String hostbdCassandra;
    private String columnFamily;
    private String keyspace;
    private String hostbdApp;
    private String usuariobdApp;
    private String passusuariobdApp;
    private String bdApp;
    private String idplanEjec;
    private String jobModo;
    private String timestampIni;
    private String timestampFin;
    private String dirLogs;
    private String nivelLogs;
    
    private String tipo; //ESTE CAMPO SE USA PARA SABER QUE TIPO DE JOB ES (CARGAINICIAL, MEDIACION ..ETC)

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
            
    public String getDirPDI() {
        return dirPDI;
    }

    public void setDirPDI(String dirPDI) {
        this.dirPDI = dirPDI;
    }

    public String getNombreJob() {
        return nombreJob;
    }

    public void setNombreJob(String nombreJob) {
        this.nombreJob = nombreJob;
    }

    public String getDirEjecucion() {
        return dirEjecucion;
    }

    public void setDirEjecucion(String dirEjecucion) {
        this.dirEjecucion = dirEjecucion;
    }

    public String getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(String repositorio) {
        this.repositorio = repositorio;
    }

    public String getUsuarioRepositorio() {
        return usuarioRepositorio;
    }

    public void setUsuarioRepositorio(String usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    public String getPassusuarioRepo() {
        return passusuarioRepo;
    }

    public void setPassusuarioRepo(String passusuarioRepo) {
        this.passusuarioRepo = passusuarioRepo;
    }

    public String getTransformaciones() {
        return transformaciones;
    }

    public void setTransformaciones(String transformaciones) {
        this.transformaciones = transformaciones;
    }

    public String getHostbdOracle() {
        return hostbdOracle;
    }

    public void setHostbdOracle(String hostbdOracle) {
        this.hostbdOracle = hostbdOracle;
    }

    public String getUsuariobdOracle() {
        return usuariobdOracle;
    }

    public void setUsuariobdOracle(String usuariobdOracle) {
        this.usuariobdOracle = usuariobdOracle;
    }

    public String getPassusuariobdOracle() {
        return passusuariobdOracle;
    }

    public void setPassusuariobdOracle(String passusuariobdOracle) {
        this.passusuariobdOracle = passusuariobdOracle;
    }

    public String getBdOracle() {
        return bdOracle;
    }

    public void setBdOracle(String bdOracle) {
        this.bdOracle = bdOracle;
    }

    public String getHostbdCassandra() {
        return hostbdCassandra;
    }

    public void setHostbdCassandra(String hostbdCassandra) {
        this.hostbdCassandra = hostbdCassandra;
    }

    public String getColumnFamily() {
        return columnFamily;
    }

    public void setColumnFamily(String columnFamily) {
        this.columnFamily = columnFamily;
    }

    public String getKeyspace() {
        return keyspace;
    }

    public void setKeyspace(String keyspace) {
        this.keyspace = keyspace;
    }

    public String getHostbdApp() {
        return hostbdApp;
    }

    public void setHostbdApp(String hostbdApp) {
        this.hostbdApp = hostbdApp;
    }

    public String getUsuariobdApp() {
        return usuariobdApp;
    }

    public void setUsuariobdApp(String usuariobdApp) {
        this.usuariobdApp = usuariobdApp;
    }

    public String getPassusuariobdApp() {
        return passusuariobdApp;
    }

    public void setPassusuariobdApp(String passusuariobdApp) {
        this.passusuariobdApp = passusuariobdApp;
    }

    public String getBdApp() {
        return bdApp;
    }

    public void setBdApp(String bdApp) {
        this.bdApp = bdApp;
    }

    public String getIdplanEjec() {
        return idplanEjec;
    }

    public void setIdplanEjec(String idplanEjec) {
        this.idplanEjec = idplanEjec;
    }

    public String getJobModo() {
        return jobModo;
    }

    public void setJobModo(String jobModo) {
        this.jobModo = jobModo;
    }

    public String getTimestampIni() {
        return timestampIni;
    }

    public void setTimestampIni(String timestampIni) {
        this.timestampIni = timestampIni;
    }

    public String getTimestampFin() {
        return timestampFin;
    }

    public void setTimestampFin(String timestampFin) {
        this.timestampFin = timestampFin;
    }

    public String getDirLogs() {
        return dirLogs;
    }

    public void setDirLogs(String dirLogs) {
        this.dirLogs = dirLogs;
    }

    public String getNivelLogs() {
        return nivelLogs;
    }

    public void setNivelLogs(String nivelLogs) {
        this.nivelLogs = nivelLogs;
    }

}
