/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teamj.android.hitchus.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 *
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


    List<Encuentro> encuentros;

    public Usuario() {
    }

    public Usuario(String nickname, String password, String email, Integer anioNacimiento, Integer mesNacimiento, BigDecimal estatura, Boolean trabajo, String premium, String numeroTelefonico, String estado, BigDecimal calificacion, String genero, String intereses, String contextura, String nivelEducacion, String idiomas, BigDecimal peso, Date creado, Boolean enfermedadesPublica) {
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
        this.creado = creado;
        this.enfermedadesPublica = enfermedadesPublica;
    }




//    @PostUpdate
//    public void updateNoSqlUser() {
//        System.out.println("actualizndo en mongo");
//        UsuarioDAO usuarioDAO = new UsuarioDAO(com.teamj.arquitectura.hitchus.nosql.model.Usuario.class, PersistenceManager.instance().datastore());
//        // com.teamj.arquitectura.hitchus.nosql.model.Usuario user = new com.teamj.arquitectura.hitchus.nosql.model.Usuario();
//        com.teamj.arquitectura.hitchus.nosql.model.Usuario user = usuarioDAO.findOne("idUsuario", id);
//        if (user != null) {
//            Query<com.teamj.arquitectura.hitchus.nosql.model.Usuario> query = PersistenceManager.instance().datastore().createQuery(com.teamj.arquitectura.hitchus.nosql.model.Usuario.class).field("idUsuario").equal(id);
//            UpdateOperations<com.teamj.arquitectura.hitchus.nosql.model.Usuario> ops;
//            if (ciudadResidencia != null && paisOrigen != null) {
//                ops = PersistenceManager.instance().datastore()
//                        .createUpdateOperations(com.teamj.arquitectura.hitchus.nosql.model.Usuario.class)
//                        .set("anioNacimiento", anioNacimiento)
//                        .set("calificacion", calificacion==null?0.0f:calificacion.floatValue())
//                        .set("contextura", contextura==null?"":contextura)
//                        .set("email", email)
//                        .set("enfermedadesPublica", enfermedadesPublica)
//                        .set("estado", estado==null?"":estado)
//                        .set("estatura", estatura==null?0.0f:estatura.floatValue())
//                        .set("genero", genero==null?"":genero)
//                        .set("idiomas", idiomas==null?"":idiomas)
//                        .set("intereses", intereses==null?"":intereses)
//                        .set("mesNacimiento", mesNacimiento)
//                        .set("nickname", nickname==null?"":nickname)
//                        .set("nivelEducacion", nivelEducacion==null?"":nivelEducacion)
//                        .set("numeroTelefonico", numeroTelefonico==null?"":numeroTelefonico)
//                        .set("password", password)
//                        .set("peso", peso==null?0.0f:peso.floatValue())
//                        .set("premium", premium==null?"":premium)
//                        .set("ciudadResidencia", ciudadResidencia.getNombre())
//                        .set("paisOrigen", paisOrigen.getNombre())
//                        .set("trabajo", trabajo==null?"":trabajo);
//
//            } else {
//                ops = PersistenceManager.instance().datastore()
//                        .createUpdateOperations(com.teamj.arquitectura.hitchus.nosql.model.Usuario.class)
//                        .set("anioNacimiento", anioNacimiento)
//                        .set("calificacion", calificacion.floatValue())
//                        .set("contextura", contextura)
//                        .set("email", email)
//                        .set("enfermedadesPublica", enfermedadesPublica)
//                        .set("estado", estado)
//                        .set("estatura", estatura.floatValue())
//                        .set("genero", genero)
//                        .set("idiomas", idiomas)
//                        .set("intereses", intereses)
//                        .set("mesNacimiento", mesNacimiento)
//                        .set("nickname", nickname)
//                        .set("nivelEducacion", nivelEducacion)
//                        .set("numeroTelefonico", numeroTelefonico)
//                        .set("password", password)
//                        .set("peso", peso.floatValue())
//                        .set("premium", premium)
//                        .set("trabajo", trabajo);
//            }
//            //com.teamj.arquitectura.hitchus.nosql.model.Usuario temp = usuarioDAO.findOne("email", user.getEmail());
//            //if (temp == null) {
//            usuarioDAO.update(query, ops);
//
//        }

        // } else {
        //}
    //}




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

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nickname=" + nickname + ", password=" + password + ", email=" + email + ", anioNacimiento=" + anioNacimiento + ", mesNacimiento=" + mesNacimiento + ", estatura=" + estatura + ", trabajo=" + trabajo + ", premium=" + premium + ", numeroTelefonico=" + numeroTelefonico + ", estado=" + estado + ", calificacion=" + calificacion + ", genero=" + genero + ", intereses=" + intereses + ", contextura=" + contextura + ", nivelEducacion=" + nivelEducacion + ", idiomas=" + idiomas + ", peso=" + peso + ", creado=" + creado + ", enfermedadesPublica=" + enfermedadesPublica + '}';
    }
}
