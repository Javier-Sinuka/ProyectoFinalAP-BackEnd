package com.contenidoPortafolio.contenidoPortafolioExperiencia.controller;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Laboral;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.LaboralRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Observable;
import java.util.Optional;

@RestController
@RequestMapping("/api/laboral")
@AllArgsConstructor
public class LaboralController {
    private final LaboralRepository laboralRepository;

    @GetMapping ("/listaLaboral")
    public List<Laboral> listaLaboral(){
        return laboralRepository.findAll();
    }

    @GetMapping ("/editarLaboral/{id}")
    public Optional<Laboral> getLaboralId(@PathVariable Integer id){
        return laboralRepository.findById(id);
    }

    @PutMapping("/actualizarLaboral/")
    public void actualizarLaboral(@RequestBody Laboral p){
        laboralRepository.saveAndFlush(p);
    }

    @PostMapping ("/crearLaboral")
    public Laboral crearLaborar(@RequestBody Laboral laboral){
        return laboralRepository.save(laboral);
    }

    @DeleteMapping ("/eliminarLaboral/{id}")
    public String eliminarLaboral(@PathVariable Integer id){
        laboralRepository.deleteById(id);
        return "Eliminado correctamente";
    }


//    @PostMapping ("/crearLaboral")
//    public String crearLaborar(@RequestBody Laboral laboral){
//      laboralRepository.save(laboral);
//        return "Laboral creado correctamente";
//    }
}
