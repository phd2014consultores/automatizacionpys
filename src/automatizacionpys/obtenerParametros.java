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
    private static String bd_pys = "";
    private static String tienda = "";
    
    public static Parametros obtenerParametros(){
        try{
            pdi = Servicio.queryapp("SELECT  conf.json_config , pe.id_plan_ejecucion , jo.job\n" +
"  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe , public.jobs as jo\n" +
"  WHERE conf.activo=true and elemento='pdi' and pe.id_job=jo.id_job and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' and pe.timestamp_planificacion in (\n" +
"		SELECT min(pe.timestamp_planificacion)\n" +
"		  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe\n" +
"		  WHERE conf.activo=true and elemento='pdi'and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' ) and pe.timestamp_planificacion::timestamp <= now()::timestamp;");
            cluster = Servicio.queryapp("SELECT  conf.json_config , pe.id_plan_ejecucion , jo.job\n" +
"  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe , public.jobs as jo\n" +
"  WHERE conf.activo=true and elemento='cluster' and pe.id_job=jo.id_job and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' and pe.timestamp_planificacion in (\n" +
"		SELECT min(pe.timestamp_planificacion)\n" +
"		  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe\n" +
"		  WHERE conf.activo=true and elemento='cluster'and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' ) and pe.timestamp_planificacion::timestamp <= now()::timestamp;");
            bd_pys = Servicio.queryapp("SELECT  conf.json_config , pe.id_plan_ejecucion , jo.job\n" +
"  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe , public.jobs as jo\n" +
"  WHERE conf.activo=true and elemento='bd_pys' and pe.id_job=jo.id_job and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' and pe.timestamp_planificacion in (\n" +
"		SELECT min(pe.timestamp_planificacion)\n" +
"		  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe\n" +
"		  WHERE conf.activo=true and elemento='bd_pys'and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' ) and pe.timestamp_planificacion::timestamp <= now()::timestamp;");
            tienda = Servicio.queryapp("SELECT  conf.json_config , pe.id_plan_ejecucion , jo.job\n" +
"  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe , public.jobs as jo\n" +
"  WHERE conf.activo=true and elemento='tienda' and pe.id_job=jo.id_job and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' and pe.timestamp_planificacion in (\n" +
"		SELECT min(pe.timestamp_planificacion)\n" +
"		  FROM public.config as conf, public.plan_ejecuciones as pe , public.pasos_plan_ejecucion as ppe\n" +
"		  WHERE conf.activo=true and elemento='tienda'and pe.id_plan_ejecucion=ppe.id_plan_ejecucion and ppe.status_plan='en espera' ) and pe.timestamp_planificacion::timestamp <= now()::timestamp;");
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //AQUI IRAN TODOS LOS SET DE LOS PARAMETROS..
        
        return param;
    }
}
