package com.api.clubhairproapi.Repositories;

import com.api.clubhairproapi.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    boolean existsByEmail(String email);

}
