package com.api.clubhairproapi.Mappers;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.Entities.Agendamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {
    @Mapping(target = "id", ignore = true)
    Agendamento toEntity(AgendamentoDTO dto);
}
