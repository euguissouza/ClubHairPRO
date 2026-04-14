package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.ENUM.StatusService;
import com.api.clubhairproapi.Entities.Agendamento;
import com.api.clubhairproapi.Mappers.AgendamentoMapper;
import com.api.clubhairproapi.Repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class AgendamentoService {
    private AgendamentoRepository repository;
    private AgendamentoMapper mapper;

    public AgendamentoService(AgendamentoRepository repository, AgendamentoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Agendamento novoAgendamento(AgendamentoDTO dto){
        Agendamento agendamento = mapper.toEntity(dto);
        agendamento.setStatus(StatusService.EmAberto);
        System.out.println(agendamento);
        repository.save(agendamento);
        return agendamento;
    }



}
