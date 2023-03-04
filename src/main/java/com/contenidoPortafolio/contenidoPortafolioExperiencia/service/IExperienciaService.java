package com.contenidoPortafolio.contenidoPortafolioExperiencia.service;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Experiencia;

import java.util.List;
import java.util.Optional;

public interface IExperienciaService {
    public List<Experiencia> list();
    public Optional<Experiencia> getOne(Long id);
    public void save(Experiencia experiencia);
    public void delete(Long id);
    public boolean existsById(Long id);
}
