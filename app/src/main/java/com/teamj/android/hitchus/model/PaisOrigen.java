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

public class PaisOrigen implements Serializable {

    private Integer id;


    private String nombre;

    public PaisOrigen() {
    }

    public PaisOrigen(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "PaisOrigen{" + "id=" + id + ", nombre=" + nombre + '}';
    }

}
