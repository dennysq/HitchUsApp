/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;


/**
 *
 * @author Klever
 */

public class Mensaje implements Serializable{

    MensajePK mensajePK;
    

    private Encuentro encuentro;
    

    private Integer secMensaje;
    

    private Integer receptor;
    

    private Integer emisor;
    

    private Date fechaEnvio;

    public Mensaje() {
    }

    public MensajePK getMensajePK() {
        return mensajePK;
    }

    public void setMensajePK(MensajePK mensajePK) {
        this.mensajePK = mensajePK;
    }

    public Encuentro getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Encuentro encuentro) {
        this.encuentro = encuentro;
    }

    public Integer getSecMensaje() {
        return secMensaje;
    }

    public void setSecMensaje(Integer secMensaje) {
        this.secMensaje = secMensaje;
    }

    public Integer getReceptor() {
        return receptor;
    }

    public void setReceptor(Integer receptor) {
        this.receptor = receptor;
    }

    public Integer getEmisor() {
        return emisor;
    }

    public void setEmisor(Integer emisor) {
        this.emisor = emisor;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }



    @Override
    public String toString() {
        return "Mensaje{" + "mensajePK=" + mensajePK + ", encuentro=" + encuentro + ", secMensaje=" + secMensaje + ", receptor=" + receptor + ", emisor=" + emisor + ", fechaEnvio=" + fechaEnvio + '}';
    }

}
