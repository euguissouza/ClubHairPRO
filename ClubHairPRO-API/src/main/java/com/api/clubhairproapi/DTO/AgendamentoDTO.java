package com.api.clubhairproapi.DTO;

import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Entities.Usuario;

public class AgendamentoDTO {
    private Usuario cliente;
    private Usuario emailCliente;
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
}
