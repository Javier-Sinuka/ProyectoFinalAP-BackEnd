package com.contenidoPortafolio.contenidoPortafolioExperiencia.controller;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Laboral;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.LaboralRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/laboral")
@AllArgsConstructor
public class LaboralController {
    private final LaboralRepository laboralRepository;

    @GetMapping ("/listaLaboral")
    public List<Laboral> listaLaboral(){
        return laboralRepository.findAll();
    }

    @PostMapping ("/crearLaboral")
    public String crearLaborar(@RequestBody Laboral laboral){
        laboralRepository.save(laboral);
        return "Laboral creado correctamente";
    }
}
