package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.ENUM.StatusService;
import com.api.clubhairproapi.Entities.Agendamento;
import com.api.clubhairproapi.Exceptions.HoraIndisponivelError;
import com.api.clubhairproapi.Mappers.AgendamentoMapper;
import com.api.clubhairproapi.Repositories.AgendamentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerExceptionResolverComposite;

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
        agendamento.setMarcarServico(dto.getMarcarServico()); // -> MapStruct nao mapeia!!!
        repository.save(agendamento);
        return agendamento;
    }



    //projetado para consultar se o horario e dia estara livre (ainda nao foi testado!)
    public void consultaVaga(AgendamentoDTO dto) throws Exception{

        List<Agendamento> agendamentos = repository.findAll();

        for(Agendamento novo : agendamentos){
          
        }

        
    }

}




