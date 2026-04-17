package com.api.clubhairproapi.Entities;

import com.api.clubhairproapi.ENUM.Roles;
import com.api.clubhairproapi.ENUM.StatusProfissional;
import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.UUID;

@Entity
@Table(name = "profissional")
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String nome;

    private StatusProfissional status;


    @Column(nullable = false)
    private Roles role;
    @Column(unique = true, nullable = false)
    private String cpf;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusProfissional getStatus() {
        return status;
    }

    public void setStatus(StatusProfissional status) {
        this.status = status;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Profissional{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", role=" + role +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
