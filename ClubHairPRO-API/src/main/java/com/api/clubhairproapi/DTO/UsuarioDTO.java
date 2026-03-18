package com.api.clubhairproapi.DTO;

import com.api.clubhairproapi.ENUM.Roles;
import jakarta.persistence.Column;

public class UsuarioDTO {
    private String nome;
    private String email;
    private Roles role;
    private String contato;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
