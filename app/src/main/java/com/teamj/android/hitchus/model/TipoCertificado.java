/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author Klever
 */

public class TipoCertificado implements Serializable{
    

    private Integer id;
    

    private String nombreCertificado;
    

    private String descripcion;
    

    private Integer tiempoValidez;
    

    private String nombreEnfermedad;

    public TipoCertificado() {
    }

    public TipoCertificado(String nombreCertificado, String descripcion, Integer tiempoValidez, String nombreEnfermedad) {
        this.nombreCertificado = nombreCertificado;
        this.descripcion = descripcion;
        this.tiempoValidez = tiempoValidez;
        this.nombreEnfermedad = nombreEnfermedad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCertificado() {
        return nombreCertificado;
    }

    public void setNombreCertificado(String nombreCertificado) {
        this.nombreCertificado = nombreCertificado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getTiempoValidez() {
        return tiempoValidez;
    }

    public void setTiempoValidez(Integer tiempoValidez) {
        this.tiempoValidez = tiempoValidez;
    }

    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }


    @Override
    public String toString() {
        return "TipoCertificado{" + "id=" + id + ", nombreCertificado=" + nombreCertificado + ", descripcion=" + descripcion + ", tiempoValidez=" + tiempoValidez + ", nombreEnfermedad=" + nombreEnfermedad + '}';
    }
    
}
