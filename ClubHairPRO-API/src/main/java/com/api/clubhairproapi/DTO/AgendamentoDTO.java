package com.api.clubhairproapi.DTO;

import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Entities.Usuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class AgendamentoDTO {
    private Usuario cliente;
    private Usuario emailCliente;
    private String servico;
    private Profissional profissional;
}
