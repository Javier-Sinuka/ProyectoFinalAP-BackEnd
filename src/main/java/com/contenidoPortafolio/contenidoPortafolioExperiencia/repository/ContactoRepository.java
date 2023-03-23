package com.contenidoPortafolio.contenidoPortafolioExperiencia.repository;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
