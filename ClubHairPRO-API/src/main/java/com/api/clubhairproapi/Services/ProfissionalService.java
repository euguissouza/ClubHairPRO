package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Mappers.ProfissionalMapper;
import com.api.clubhairproapi.Repositories.ProfissionalRepository;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

import static com.api.clubhairproapi.ENUM.Roles.PROFISSIONAL;

@Service
public class ProfissionalService {
    private ProfissionalRepository repository;
    private ProfissionalMapper mapper;

    public ProfissionalService(ProfissionalRepository repository, ProfissionalMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }


    public Profissional salvaNovoProfissional(ProfissionalDTO dto){
            Profissional profissional = mapper.toEntity(dto);
            System.out.println(profissional);
            profissional.setRole(PROFISSIONAL);
            return repository.save(profissional);
    }

//    public Profissional find(ProfissionalDTO dto){
//        List<Profissional> busca = repository.findAll();
//        return dto;
//    }


}
