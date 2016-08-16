/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Klever
 */

public class EstadisticaUsuario implements Serializable{

    private Usuario usuario;
    

    private BigDecimal higiene;
    

    private BigDecimal comportamiento;
    

    private BigDecimal amabilidad;
    

    private BigDecimal general;
    

    private Integer bloqueos;
    

    private BigDecimal promedioActual;
    

    private Integer solicitudesEnviadas;
    

    private Integer solicitudesRecibidas;
    

    private Integer mensajesEnviados;
    

    private Integer mensajesRecibidos;
    

    private Date ultimaActualizacion;

    public EstadisticaUsuario() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public BigDecimal getHigiene() {
        return higiene;
    }

    public void setHigiene(BigDecimal higiene) {
        this.higiene = higiene;
    }

    public BigDecimal getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(BigDecimal comportamiento) {
        this.comportamiento = comportamiento;
    }

    public BigDecimal getAmabilidad() {
        return amabilidad;
    }

    public void setAmabilidad(BigDecimal amabilidad) {
        this.amabilidad = amabilidad;
    }

    public BigDecimal getGeneral() {
        return general;
    }

    public void setGeneral(BigDecimal general) {
        this.general = general;
    }

    public Integer getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(Integer bloqueos) {
        this.bloqueos = bloqueos;
    }

    public BigDecimal getPromedioActual() {
        return promedioActual;
    }

    public void setPromedioActual(BigDecimal promedioActual) {
        this.promedioActual = promedioActual;
    }

    public Integer getSolicitudesEnviadas() {
        return solicitudesEnviadas;
    }

    public void setSolicitudesEnviadas(Integer solicitudesEnviadas) {
        this.solicitudesEnviadas = solicitudesEnviadas;
    }

    public Integer getSolicitudesRecibidas() {
        return solicitudesRecibidas;
    }

    public void setSolicitudesRecibidas(Integer solicitudesRecibidas) {
        this.solicitudesRecibidas = solicitudesRecibidas;
    }

    public Integer getMensajesEnviados() {
        return mensajesEnviados;
    }

    public void setMensajesEnviados(Integer mensajesEnviados) {
        this.mensajesEnviados = mensajesEnviados;
    }

    public Integer getMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public void setMensajesRecibidos(Integer mensajesRecibidos) {
        this.mensajesRecibidos = mensajesRecibidos;
    }

    public Date getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    public void setUltimaActualizacion(Date ultimaActualizacion) {
        this.ultimaActualizacion = ultimaActualizacion;
    }




    @Override
    public String toString() {
        return "EstadisticaUsuario{" + "usuario=" + usuario + ", higiene=" + higiene + ", comportamiento=" + comportamiento + ", amabilidad=" + amabilidad + ", general=" + general + ", bloqueos=" + bloqueos + ", promedioActual=" + promedioActual + ", solicitudesEnviadas=" + solicitudesEnviadas + ", solicitudesRecibidas=" + solicitudesRecibidas + ", mensajesEnviados=" + mensajesEnviados + ", mensajesRecibidos=" + mensajesRecibidos + ", ultimaActualizacion=" + ultimaActualizacion + '}';
    }

}
