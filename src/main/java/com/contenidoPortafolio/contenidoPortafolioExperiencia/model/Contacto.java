package com.contenidoPortafolio.contenidoPortafolioExperiencia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "contact-me")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombreRemitente;
    private String correoRemitente;
    private String contendioMensaje;

    public Contacto(Long id, String nombreRemitente, String correoRemitente, String contendioMensaje) {
        this.id = id;
        this.nombreRemitente = nombreRemitente;
        this.correoRemitente = correoRemitente;
        this.contendioMensaje = contendioMensaje;
    }

    public Contacto() {
    }

    public Long getId() {
        return id;
    }

    public String getNombreRemitente() {
        return nombreRemitente;
    }

    public String getCorreoRemitente() {
        return correoRemitente;
    }

    public String getContendioMensaje() {
        return contendioMensaje;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }

    public void setCorreoRemitente(String correoRemitente) {
        this.correoRemitente = correoRemitente;
    }

    public void setContendioMensaje(String contendioMensaje) {
        this.contendioMensaje = contendioMensaje;
    }
}
