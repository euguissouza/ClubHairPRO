package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Repositories.ProfissionalRepository;
import com.api.clubhairproapi.Services.ProfissionalService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chp/profissional")
public class ProfissionalController {
    private ProfissionalService service;
    private ProfissionalRepository repository;

    public ProfissionalController(ProfissionalService service, ProfissionalRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @PostMapping("/post")
    public Profissional adicionaBanco(@RequestBody @Valid ProfissionalDTO dto){
        Profissional novoProfissional = service.salvaNovoProfissional(dto);
        return novoProfissional;
    }

    @GetMapping("/get")
    public Profissional busca(Profissional profissional){
        Profissional find = service.find(profissional);
        return find;
    }

}
