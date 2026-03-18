package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.UsuarioDTO;
import com.api.clubhairproapi.Entities.Usuario;
import com.api.clubhairproapi.Repositories.UsuarioRepository;
import com.api.clubhairproapi.Services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/chp/user")
public class UsuarioController {
    private UsuarioService service;
    private UsuarioRepository repository;

    public UsuarioController(UsuarioService service, UsuarioRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public Usuario salvaUsuario(@RequestBody UsuarioDTO dto){
        System.out.println(dto);
        return service.salvaNovoUsuario(dto);
    }

    @GetMapping("/get")
    public Usuario buscaBanco(Usuario user){
        List<Usuario> busca = repository.findAll();
        return user;
    }

}
