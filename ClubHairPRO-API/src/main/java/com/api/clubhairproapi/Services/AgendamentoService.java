package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.ENUM.PaymentMethod;
import com.api.clubhairproapi.ENUM.StatusProfissional;
import com.api.clubhairproapi.ENUM.StatusService;
import com.api.clubhairproapi.Entities.Agendamento;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Exceptions.HoraIndisponivelError;
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
        agendamento.setDataAgendamento(dto.getDataAgendamento());  // -> MapStruct não mapeia o LocalDate
        agendamento.setHoraAgendamento(dto.getHoraAgendamento());  // -> MapStruct não mapeia o LocalTime
        System.out.println(agendamento.getDataAgendamento());
        repository.save(agendamento);
        return agendamento;
    }



    //projetado para consultar se o horario e dia estara livre (ainda nao foi testado!)
    public void consultaVaga(AgendamentoDTO dto) throws Exception{
        Agendamento novo = novoAgendamento(dto);

        boolean consultaHora = repository.horaAgendamento(novo.getDataAgendamento(), novo.getHoraAgendamento());

        if(consultaHora){
            throw new HoraIndisponivelError("Horario indisponivel");
        }
    }


}




