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

public class CalificacionEncuentroPK implements Serializable{
    

    private Integer encuentro;
     

    private Integer usuario;

    public CalificacionEncuentroPK() {
    }

    public CalificacionEncuentroPK(Integer encuentro, Integer usuario) {
        this.encuentro = encuentro;
        this.usuario = usuario;
    }

    public Integer getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Integer encuentro) {
        this.encuentro = encuentro;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }



    

}
