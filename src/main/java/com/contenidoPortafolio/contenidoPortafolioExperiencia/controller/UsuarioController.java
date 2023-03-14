package com.contenidoPortafolio.contenidoPortafolioExperiencia.controller;

import com.contenidoPortafolio.contenidoPortafolioExperiencia.model.Usuario;
import com.contenidoPortafolio.contenidoPortafolioExperiencia.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
//@CrossOrigin(origins = "http://localhost:4200") //Rutting a Angular y su  puerto
@AllArgsConstructor
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    @GetMapping ("/listaUsuarios")
    public List<Usuario> listaUsuarios(){return  usuarioRepository.findAll();}

    @PostMapping ("/crearUsuario")
    public String crearUsuario(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
        return "Usuario creado correctamente";
    }
}
