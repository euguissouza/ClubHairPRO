package com.api.clubhairproapi.DTO;

import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Entities.Usuario;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AgendamentoDTO {
    private Usuario cliente;
    private Usuario emailCliente;

    private LocalDateTime marcarServico;


    private String servico;
    private Profissional profissional;

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

    public LocalDateTime getMarcarServico() {
        return marcarServico;
    }

    public void setMarcarServico(LocalDateTime marcarServico) {
        this.marcarServico = marcarServico;
    }
}
