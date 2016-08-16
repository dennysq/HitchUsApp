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

public class MensajePK implements Serializable{

    private Integer encuentro;
     

    private Integer secMensaje;

    public MensajePK() {
    }

    public MensajePK(Integer encuentro, Integer secMensaje) {
        this.encuentro = encuentro;
        this.secMensaje = secMensaje;
    }

    public Integer getEncuentro() {
        return encuentro;
    }

    public void setEncuentro(Integer encuentro) {
        this.encuentro = encuentro;
    }

    public Integer getSecMensaje() {
        return secMensaje;
    }

    public void setSecMensaje(Integer secMensaje) {
        this.secMensaje = secMensaje;
    }


}
