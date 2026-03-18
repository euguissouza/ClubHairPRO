package com.api.clubhairproapi.Mappers;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProfissionalMapper {

    @Mapping(target = "id", ignore = true)
    Profissional toEntity(ProfissionalDTO dto);

//    @Mapping(target = "nome", ignore = false)
//    ProfissionalDTO toDTO(Profissional profissional);

}
