package com.api.clubhairproapi.Entities;

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

    @Column(nullable = false)
    private Role role;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
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
