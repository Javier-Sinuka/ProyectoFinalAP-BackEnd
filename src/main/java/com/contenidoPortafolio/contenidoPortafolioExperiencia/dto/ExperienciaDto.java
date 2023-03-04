package com.contenidoPortafolio.contenidoPortafolioExperiencia.dto;



public class ExperienciaDto {
    private int id;
    private String nombreExperiencia;
    private String lugarExperiencia;
    private String modalidadExperiencia;
    private int tiempoExperiencia;
    private String contenidoExperiencia;

    public ExperienciaDto(int id, String nombreExperiencia, String lugarExperiencia, String modalidadExperiencia, int tiempoExperiencia, String contenidoExperiencia) {
        this.id = id;
        this.nombreExperiencia = nombreExperiencia;
        this.lugarExperiencia = lugarExperiencia;
        this.modalidadExperiencia = modalidadExperiencia;
        this.tiempoExperiencia = tiempoExperiencia;
        this.contenidoExperiencia = contenidoExperiencia;
    }

    public ExperienciaDto() {
    }

    public int getId(){
        return id;
    }
    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public String getLugarExperiencia() {
        return lugarExperiencia;
    }

    public String getModalidadExperiencia() {
        return modalidadExperiencia;
    }

    public int getTiempoExperiencia() {
        return tiempoExperiencia;
    }

    public String getContenidoExperiencia() {
        return contenidoExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public void setLugarExperiencia(String lugarExperiencia) {
        this.lugarExperiencia = lugarExperiencia;
    }

    public void setModalidadExperiencia(String modalidadExperiencia) {
        this.modalidadExperiencia = modalidadExperiencia;
    }

    public void setTiempoExperiencia(int tiempoExperiencia) {
        this.tiempoExperiencia = tiempoExperiencia;
    }

    public void setContenidoExperiencia(String contenidoExperiencia) {
        this.contenidoExperiencia = contenidoExperiencia;
    }

    public void setId(int id){
        this.id = id;
    }
}
