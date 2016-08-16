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

public class Bloqueo implements Serializable{
    

    BloqueoPK bloqueoPK;
    

    private Usuario usuario1;
    


    private Usuario usuario2;
    

    private Date fecha;

    public Bloqueo() {
    }

    public BloqueoPK getBloqueoPK() {
        return bloqueoPK;
    }

    public void setBloqueoPK(BloqueoPK bloqueoPK) {
        this.bloqueoPK = bloqueoPK;
    }

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    public Usuario getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(Usuario usuario2) {
        this.usuario2 = usuario2;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

   

    @Override
    public String toString() {
        return "Bloqueo{" + "bloqueoPK=" + bloqueoPK + ", usuario1=" + usuario1 + ", usuario2=" + usuario2 + ", fecha=" + fecha + '}';
    }

 
    
    
}
