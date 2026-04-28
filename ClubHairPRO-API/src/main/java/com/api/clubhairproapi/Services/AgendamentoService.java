package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.ENUM.PaymentMethod;
import com.api.clubhairproapi.ENUM.StatusProfissional;
import com.api.clubhairproapi.ENUM.StatusService;
import com.api.clubhairproapi.Entities.Agendamento;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Mappers.AgendamentoMapper;
import com.api.clubhairproapi.Repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class AgendamentoService {
    private AgendamentoRepository repository;
    private AgendamentoMapper mapper;

    public AgendamentoService(AgendamentoRepository repository, AgendamentoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Agendamento novoAgendamento(AgendamentoDTO dto) {
        Agendamento agendamento = mapper.toEntity(dto);
        agendamento.setStatus(StatusService.EmAberto);
        System.out.println(agendamento);
        repository.save(agendamento);
        return agendamento;
    }



    //projetado para consultar se o horario e dia estara livre (ainda nao foi testado!)
    @Transactional
    public void ConsultaVaga(AgendamentoDTO dto) throws Exception {
        List<Agendamento> agendamentos = repository.findAll();
        for (Agendamento existente : agendamentos) {
            if (existente.getHoraAgendamento()
                    .equals(novoAgendamento(dto).getHoraAgendamento()) && existente.getDataAgendamento()
                    .equals(novoAgendamento(dto).getDataAgendamento())) {
                throw new Exception("Horário Indisponivel");
            }
        }

    }




    }




