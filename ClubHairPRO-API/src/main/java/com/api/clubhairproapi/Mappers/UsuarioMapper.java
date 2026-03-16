package com.api.clubhairproapi.Mappers;

import com.api.clubhairproapi.DTO.UsuarioDTO;
import com.api.clubhairproapi.Entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mapping(target = "id", ignore = true)
    Usuario toEntity(UsuarioDTO dto);

}
