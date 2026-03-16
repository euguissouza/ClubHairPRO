package com.api.clubhairproapi.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario cliente;

    @JoinColumn(name = "usuario_email", referencedColumnName = "email") //-> melhor jeito de refenciar uma coluna especifica
    private Usuario emailCliente;

    private String servico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }

    public Usuario getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(Usuario emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "Id=" + Id +
                ", cliente=" + cliente +
                ", emailCliente=" + emailCliente +
                ", servico='" + servico + '\'' +
                ", profissional=" + profissional +
                '}';
    }
}
