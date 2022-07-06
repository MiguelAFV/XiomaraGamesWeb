package Modelo;

import java.sql.Date;

public class Solicitud
{
    String cod_solicitud;
    String cod_cli;
    String usu_cli;
    String asunto;
    String descripcion;
    String imagen;
    Date fecha_solicitud;
    String respuesta;
    Date fecha_solucion;
    int estado;

    public String getCod_solicitud() {
        return cod_solicitud;
    }

    public void setCod_solicitud(String cod_solicitud) {
        this.cod_solicitud = cod_solicitud;
    }

    public String getCod_cli() {
        return cod_cli;
    }

    public void setCod_cli(String cod_cli) {
        this.cod_cli = cod_cli;
    }

    public String getUsu_cli() {
        return usu_cli;
    }

    public void setUsu_cli(String usu_cli) {
        this.usu_cli = usu_cli;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Date getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(Date fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Date getFecha_solucion() {
        return fecha_solucion;
    }

    public void setFecha_solucion(Date fecha_solucion) {
        this.fecha_solucion = fecha_solucion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}