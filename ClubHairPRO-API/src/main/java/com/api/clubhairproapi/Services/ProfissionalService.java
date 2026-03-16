package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Mappers.ProfissionalMapper;
import com.api.clubhairproapi.Repositories.ProfissionalRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfissionalService {
    private ProfissionalRepository repository;
    private ProfissionalMapper mapper;

    public ProfissionalService(ProfissionalRepository repository, ProfissionalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public Profissional salvaNovoProfissional(ProfissionalDTO dto){
        Profissional clt = mapper.toEntity(dto);
        return repository.save(clt);
    }

}
