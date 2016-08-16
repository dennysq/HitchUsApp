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

public class CertificadoPK implements Serializable{
    

    private Integer usuario;
     

    private Integer tipoCertificado;

    public CertificadoPK() {
    }

    public CertificadoPK(Integer usuario, Integer tipoCertificado) {
        this.usuario = usuario;
        this.tipoCertificado = tipoCertificado;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Integer getTipoCertificado() {
        return tipoCertificado;
    }

    public void setTipoCertificado(Integer tipoCertificado) {
        this.tipoCertificado = tipoCertificado;
    }


    
}
