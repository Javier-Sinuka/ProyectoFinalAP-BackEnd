package com.contenidoPortafolio.contenidoPortafolioExperiencia.controller;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.ContactoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/contacto")
@AllArgsConstructor
public class ContactoController {
    private final ContactoRepository contactoRepository;
//    private JavaMailSender s;
}
