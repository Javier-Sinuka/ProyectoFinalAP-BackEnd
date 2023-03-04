package com.contenidoPortafolio.contenidoPortafolioExperiencia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;
    private String nombreExperiencia;
    private String modalidadExperiencia;
    private String lugarExperiencia;
    private int tiempoExperiencia;
    private String contenidoExperiencia;

    public Experiencia(int id, String nombreExperiencia, String modalidadExperiencia, String lugarExperiencia, int tiempoExperiencia, String contenidoExperiencia) {
        this.id = id;
        this.nombreExperiencia = nombreExperiencia;
        this.modalidadExperiencia = modalidadExperiencia;
        this.lugarExperiencia = lugarExperiencia;
        this.tiempoExperiencia = tiempoExperiencia;
        this.contenidoExperiencia = contenidoExperiencia;
    }

    public Experiencia() {

    }

    public int getId() {
        return id;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public String getModalidadExperiencia() {
        return modalidadExperiencia;
    }

    public String getLugarExperiencia() {
        return lugarExperiencia;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public String getContenidoExperiencia() {
        return contenidoExperiencia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public void setModalidadExperiencia(String modalidadExperiencia) {
        this.modalidadExperiencia = modalidadExperiencia;
    }

    public void setLugarExperiencia(String lugarExperiencia) {
        this.lugarExperiencia = lugarExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public void setContenidoExperiencia(String contenidoExperiencia) {
        this.contenidoExperiencia = contenidoExperiencia;
    }
}
