package com.contenidoPortafolio.contenidoPortafolioExperiencia.repository;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findOneByEmail(String email);
}
