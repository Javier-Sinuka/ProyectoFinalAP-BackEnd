package com.contenidoPortafolio.contenidoPortafolioExperiencia.repository;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Laboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaboralRepository extends JpaRepository<Laboral, Integer> {
}
