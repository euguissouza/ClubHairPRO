package com.api.clubhairproapi.Services;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Exceptions.CpfError;
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

            if(repository.existsBycpf(profissional.getCpf())) {
                throw  new CpfError("O CPF informado já foi cadastrado!");
            }

            profissional.setRole(PROFISSIONAL);
            System.out.println("Profissional cadastrado!" + profissional);
            return repository.save(profissional);
    }
}



