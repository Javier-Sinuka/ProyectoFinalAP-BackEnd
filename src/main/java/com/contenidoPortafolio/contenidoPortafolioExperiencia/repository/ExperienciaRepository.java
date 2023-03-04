package com.contenidoPortafolio.contenidoPortafolioExperiencia.repository;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
//    Optional<Experiencia> findByExperiencia(String experiencia); //Para buscar el titulo de la Experiencia
//    boolean existsByExperiencia(String experiencia);

}
