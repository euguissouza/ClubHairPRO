package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.UsuarioDTO;
import com.api.clubhairproapi.ENUM.Roles;
import com.api.clubhairproapi.Entities.Usuario;
import com.api.clubhairproapi.Exceptions.EmailError;
import com.api.clubhairproapi.Mappers.UsuarioMapper;
import com.api.clubhairproapi.Repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

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
        user.setRole(Roles.USER);

        if(repository.existsByEmail(user.getEmail())) {
            throw new EmailError("Já existe um usuário com esse email cadastrado");
        }
        System.out.println("Novo cliente adicionado: " + user);
        return repository.save(user);
    }

}
