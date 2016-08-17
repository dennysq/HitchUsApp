/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;


/**
 *
 * @author Klever
 */

public class CalificacionEncuentro implements Serializable {


    CalificacionEncuentroPK calificacionEncuentroPK;


    private Usuario usuario;


    private Encuentro encuentro;


    private BigDecimal higiene;


    private BigDecimal comportamiento;


    private BigDecimal amabilidad;


    private BigDecimal general;


    private Integer higieneInt;


    private Integer comportamientoInt;


    private Integer amabilidadInt;


    private Integer generalInt;

    public Integer getHigieneInt() {
        return higieneInt;
    }

    public void setHigieneInt(Integer higieneInt) {
        this.higieneInt = higieneInt;
    }

    public Integer getComportamientoInt() {
        return comportamientoInt;
    }

    public void setComportamientoInt(Integer comportamientoInt) {
        this.comportamientoInt = comportamientoInt;
    }

    public Integer getAmabilidadInt() {
        return amabilidadInt;
    }

    public void setAmabilidadInt(Integer amabilidadInt) {
        this.amabilidadInt = amabilidadInt;
    }

    public Integer getGeneralInt() {
        return generalInt;
    }

    public void setGeneralInt(Integer generalInt) {
        this.generalInt = generalInt;
    }

    public CalificacionEncuentro() {
    }

    public CalificacionEncuentroPK getCalificacionEncuentroPK() {
        return calificacionEncuentroPK;
    }

    public void setCalificacionEncuentroPK(CalificacionEncuentroPK calificacionEncuentroPK) {
        this.calificacionEncuentroPK = calificacionEncuentroPK;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
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

    @Override
    public String toString() {
        return "Calificacion_Encuentro{" + "calificacionEncuentroPK=" + calificacionEncuentroPK + ", usuario=" + usuario + ", encuentro=" + encuentro + ", higiene=" + higiene + ", comportamiento=" + comportamiento + ", amabilidad=" + amabilidad + ", general=" + general + '}';
    }

}
