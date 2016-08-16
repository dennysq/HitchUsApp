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

public class Ubicacion implements Serializable{
    

    UbicacionPK ubicacionPK;
    

    private Integer fecha;
    

    private Usuario usuario;
    

    private BigDecimal latitud;
    

    private BigDecimal longitud;

    public Ubicacion() {
    }

    public UbicacionPK getUbicacionPK() {
        return ubicacionPK;
    }

    public void setUbicacionPK(UbicacionPK ubicacionPK) {
        this.ubicacionPK = ubicacionPK;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getFecha() {
        return fecha;
    }

    public void setFecha(Integer fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getLatitud() {
        return latitud;
    }

    public void setLatitud(BigDecimal latitud) {
        this.latitud = latitud;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }


    @Override
    public String toString() {
        return "Ubicacion{" + "ubicacionPK=" + ubicacionPK + ", usuario=" + usuario + ", fecha=" + fecha + ", latitud=" + latitud + ", longitud=" + longitud + '}';
    }
    
}
