package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.ProfissionalDTO;
import com.api.clubhairproapi.Entities.Profissional;
import com.api.clubhairproapi.Repositories.ProfissionalRepository;
import com.api.clubhairproapi.Services.ProfissionalService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<List<Profissional>> busca(Profissional profissional){
        List<Profissional> find = repository.findAll();
        return ResponseEntity.ok(find);
    }

}
