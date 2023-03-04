package com.contenidoPortafolio.contenidoPortafolioExperiencia.service;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Experiencia;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.ExperienciaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ExperienciaService implements IExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepository;
    @Override
    public List<Experiencia> list(){
        return experienciaRepository.findAll();
    }
    @Override
    public Optional<Experiencia> getOne(Long id){
        return experienciaRepository.findById(id);
    }
    @Override
    public void save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
    @Override
    public void delete(Long id){
        experienciaRepository.deleteById(id);
    }
    @Override
    public boolean existsById(Long id){
        return experienciaRepository.existsById(id);
    }

}
