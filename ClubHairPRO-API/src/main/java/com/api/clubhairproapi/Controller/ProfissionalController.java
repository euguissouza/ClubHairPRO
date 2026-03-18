package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Repositories.ProfissionalRepository;
import com.api.clubhairproapi.Services.ProfissionalService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chp/profisisonal")
public class ProfissionalController {

    private ProfissionalService service;
    private ProfissionalRepository repository;

    public ProfissionalController(ProfissionalService service, ProfissionalRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public Profissional criaProfissional(@RequestBody @Valid ProfissionalDTO dto){
        Profissional profissional = service.salvaNovoProfissional(dto);

        System.out.println("salvo: " + profissional);
        return profissional;
    }

    @GetMapping("/get")
    public Profissional busca(Profissional profissional){
        List<Profissional> search = repository.findAll();
        return profissional;
    }




}
