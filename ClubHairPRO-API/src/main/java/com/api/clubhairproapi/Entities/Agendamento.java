package com.api.clubhairproapi.Entities;

import com.api.clubhairproapi.ENUM.StatusService;
import jakarta.persistence.*;

@Entity
@Table(name = "agendamentos")
public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "usuario_id")
    private Usuario cliente;

//    @OneToOne
//    @JoinColumn(name = "usuario_email", referencedColumnName = "email") //-> melhor jeito de refenciar uma coluna especifica
//    private Usuario emailCliente;

    private String servico;

    private StatusService status;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "profissional_id", unique = false)
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

//    public Usuario getEmailCliente() {
//        return emailCliente;
//    }
//
//    public void setEmailCliente(Usuario emailCliente) {
//        this.emailCliente = emailCliente;
//    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public StatusService getStatus() {
        return status;
    }

    public void setStatus(StatusService status) {
        this.status = status;
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
//                ", emailCliente=" + emailCliente +
                ", servico='" + servico + '\'' +
                ", status=" + status +
                ", profissional=" + profissional +
                '}';
    }
}
