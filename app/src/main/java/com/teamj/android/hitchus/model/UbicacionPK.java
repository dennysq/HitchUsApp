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

public class UbicacionPK implements Serializable{
    

    private Integer fecha;
     

    private Integer usuario;

    public UbicacionPK() {
    }

    public UbicacionPK(Integer fecha, Integer usuario) {
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }


    
}
