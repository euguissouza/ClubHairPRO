package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.UsuarioDTO;
import com.api.clubhairproapi.Entities.Usuario;
import com.api.clubhairproapi.Repositories.UsuarioRepository;
import com.api.clubhairproapi.Services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chp/cliente")
public class UsuárioController {
    private UsuarioService service;
    private UsuarioRepository repository;

    public UsuárioController(UsuarioService service, UsuarioRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public Usuario salvaBanco(@RequestBody @Valid UsuarioDTO dto){
        Usuario user = service.salvaNovoUsuario(dto);
        return user;
    }

    @GetMapping("/get")
    public ResponseEntity<List<Usuario>> buscaBanco(UsuarioDTO dto){
        List<Usuario> find = repository.findAll();
        return ResponseEntity.ok(find);
    }

}
