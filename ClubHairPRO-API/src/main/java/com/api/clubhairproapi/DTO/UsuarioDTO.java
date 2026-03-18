package com.api.clubhairproapi.DTO;

import com.api.clubhairproapi.ENUM.Roles;
import jakarta.persistence.Column;

public class UsuarioDTO {
    private String nome;
    private String email;
    private Roles role;
    private String contato;

    @Override
    public String toString() {
        return "UsuarioDTO{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                ", contato='" + contato + '\'' +
                '}';
    }
}
