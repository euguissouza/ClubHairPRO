package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.UsuarioDTO;
import com.api.clubhairproapi.Entities.Usuario;
import com.api.clubhairproapi.Mappers.UsuarioMapper;
import com.api.clubhairproapi.Repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    private UsuarioRepository repository;
    private UsuarioMapper mapper;

    public UsuarioService(UsuarioRepository repository, UsuarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Usuario salvaNovoUsuario(UsuarioDTO dto){
        Usuario user = mapper.toEntity(dto);
        System.out.println(user);
        return repository.save(user);
    }

    public void buscaBanco(){
        List<Usuario> find = repository.findAll();
    }

}
