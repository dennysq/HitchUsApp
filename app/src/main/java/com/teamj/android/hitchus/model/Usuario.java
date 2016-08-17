/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


/**
 * @author Dennys
 */

public class Usuario implements Serializable {


    private Integer id;


    private String nickname;


    private String password;


    private String email;


    private Integer anioNacimiento;


    private Integer mesNacimiento;


    private BigDecimal estatura;


    private Boolean trabajo;


    private String premium;


    private String numeroTelefonico;


    private String estado;


    private BigDecimal calificacion;


    private String genero;


    private String intereses;


    private String contextura;


    private String nivelEducacion;


    private String idiomas;


    private BigDecimal peso;


    private Boolean enfermedadesPublica;


    private Date creado;


    private PaisOrigen paisOrigen;


    private CiudadResidencia ciudadResidencia;

    private Integer nivelHitch;


    private List<Encuentro> encuentros;
    private List<Imagen> imagenes;

    public Usuario() {
    }

    public Usuario(Integer id, String nickname, String password, String email, Integer anioNacimiento, Integer mesNacimiento, BigDecimal estatura, Boolean trabajo, String premium, String numeroTelefonico, String estado, BigDecimal calificacion, String genero, String intereses, String contextura, String nivelEducacion, String idiomas, BigDecimal peso, Boolean enfermedadesPublica, Date creado, PaisOrigen paisOrigen, CiudadResidencia ciudadResidencia, Integer nivelHitch, List<Encuentro> encuentros, List<Imagen> imagenes) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.anioNacimiento = anioNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.estatura = estatura;
        this.trabajo = trabajo;
        this.premium = premium;
        this.numeroTelefonico = numeroTelefonico;
        this.estado = estado;
        this.calificacion = calificacion;
        this.genero = genero;
        this.intereses = intereses;
        this.contextura = contextura;
        this.nivelEducacion = nivelEducacion;
        this.idiomas = idiomas;
        this.peso = peso;
        this.enfermedadesPublica = enfermedadesPublica;
        this.creado = creado;
        this.paisOrigen = paisOrigen;
        this.ciudadResidencia = ciudadResidencia;
        this.nivelHitch = nivelHitch;
        //this.encuentros = encuentros;
        //this.imagenes = imagenes;
        this.encuentros = new ArrayList<>();
        this.imagenes = new ArrayList<>();
    }

    public Integer getNivelHitch() {
        return nivelHitch;
    }

    public void setNivelHitch(Integer nivelHitch) {
        this.nivelHitch = nivelHitch;
    }

    public List<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public List<Encuentro> getEncuentros() {
        return encuentros;
    }

    public void setEncuentros(List<Encuentro> encuentros) {
        this.encuentros = encuentros;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(Integer anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public Integer getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(Integer mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public BigDecimal getEstatura() {
        return estatura;
    }

    public void setEstatura(BigDecimal estatura) {
        this.estatura = estatura;
    }

    public Boolean getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(Boolean trabajo) {
        this.trabajo = trabajo;
    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public BigDecimal getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(BigDecimal calificacion) {
        this.calificacion = calificacion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public String getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Boolean getEnfermedadesPublica() {
        return enfermedadesPublica;
    }

    public void setEnfermedadesPublica(Boolean enfermedadesPublica) {
        this.enfermedadesPublica = enfermedadesPublica;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public CiudadResidencia getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(CiudadResidencia ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getEdad() {
        Date fechaActual = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(fechaActual);
        int year = cal.get(Calendar.YEAR);
        return (year - this.anioNacimiento) + "";


    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nickname=" + nickname + ", password=" + password + ", email=" + email + ", anioNacimiento=" + anioNacimiento + ", mesNacimiento=" + mesNacimiento + ", estatura=" + estatura + ", trabajo=" + trabajo + ", premium=" + premium + ", numeroTelefonico=" + numeroTelefonico + ", estado=" + estado + ", calificacion=" + calificacion + ", genero=" + genero + ", intereses=" + intereses + ", contextura=" + contextura + ", nivelEducacion=" + nivelEducacion + ", idiomas=" + idiomas + ", peso=" + peso + ", creado=" + creado + ", enfermedadesPublica=" + enfermedadesPublica + '}';
    }


    public String getProfileImageURL() {
        for (Imagen i : this.getImagenes()) {
            if (i.getPerfil()) {
                return String.valueOf(i.getId());
            }
        }
        return null;
    }
}
