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

public class Certificado implements Serializable{
    

    CertificadoPK certificadoPK;
    

    private Usuario usuario;
    

    private  TipoCertificado tipoCertificado;

    private EntidadCertificadora entidadCertificadora;
    

    private String path;
    

    private Date fechaRecepcion;
    

    private Date fechaValidacion;
    

    private Date fechaCaducidad;
    

    private String resultado;
    

    private String nombreArchivo;
    

    private Boolean verificado;

    public Certificado() {
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public CertificadoPK getCertificadoPK() {
        return certificadoPK;
    }

    public void setCertificadoPK(CertificadoPK certificadoPK) {
        this.certificadoPK = certificadoPK;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoCertificado getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(TipoCertificado tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }

    public EntidadCertificadora getEntidadCertificadora() {
        return entidadCertificadora;
    }

    public void setEntidadCertificadora(EntidadCertificadora entidadCertificadora) {
        this.entidadCertificadora = entidadCertificadora;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public Date getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Boolean getVerificado() {
        return verificado;
    }

    public void setVerificado(Boolean verificado) {
        this.verificado = verificado;
    }


    @Override
    public String toString() {
        return "Certificado{" + "certificadoPK=" + certificadoPK + ", usuario=" + usuario + ", tipoCertificado=" + tipoCertificado + ", entidadCertificadora=" + entidadCertificadora + ", path=" + path + ", fechaRecepcion=" + fechaRecepcion + ", fechaValidacion=" + fechaValidacion + ", fechaCaducidad=" + fechaCaducidad + ", resultado=" + resultado + ", verificado=" + verificado + '}';
    }

}
