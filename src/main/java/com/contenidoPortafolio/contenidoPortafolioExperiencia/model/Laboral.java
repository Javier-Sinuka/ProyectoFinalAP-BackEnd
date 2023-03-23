package com.contenidoPortafolio.contenidoPortafolioExperiencia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "laboral")
public class Laboral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreExperiencia;
    private String modalidadExperiencia;
    private String lugarExperiencia;
    private String contenidoExperiencia;

    private String periodoExperiencia;

    public Laboral(Long id,
                   String nombreExperiencia,
                   String modalidadExperiencia,
                   String lugarExperiencia,
                   String periodoExperiencia,
                   String contenidoExperiencia) {
        this.id = id;
        this.nombreExperiencia = nombreExperiencia;
        this.modalidadExperiencia = modalidadExperiencia;
        this.lugarExperiencia = lugarExperiencia;
        this.periodoExperiencia = periodoExperiencia;
        this.contenidoExperiencia = contenidoExperiencia;
    }

    public Laboral() {
    }

    public Long getId() {
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

    public String getPeriodoExperiencia() {
        return periodoExperiencia;
    }

    public String getContenidoExperiencia() {
        return contenidoExperiencia;
    }

    public void setId(Long id) {
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

    public void setPeriodoExperiencia(String periodoExperiencia) {
        this.periodoExperiencia = periodoExperiencia;
    }

    public void setContenidoExperiencia(String contenidoExperiencia) {
        this.contenidoExperiencia = contenidoExperiencia;
    }
}
