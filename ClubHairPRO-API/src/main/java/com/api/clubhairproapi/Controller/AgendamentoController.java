package com.api.clubhairproapi.Controller;

import com.api.clubhairproapi.DTO.AgendamentoDTO;
import com.api.clubhairproapi.ENUM.PaymentMethod;
import com.api.clubhairproapi.Entities.Agendamento;
import com.api.clubhairproapi.Repositories.AgendamentoRepository;
import com.api.clubhairproapi.Services.AgendamentoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("chp/agendamento")
public class AgendamentoController {
    private AgendamentoRepository repository;
    private AgendamentoService service;

    public AgendamentoController(AgendamentoRepository repository, AgendamentoService service) {
        this.repository = repository;
        this.service = service;
    }

    @PostMapping("/post")
    public ResponseEntity<String> adicionaBanco(@RequestBody @Valid AgendamentoDTO dto) throws Exception{
        service.ConsultaVaga(dto);
        Agendamento agendamento = service.novoAgendamento(dto);
        return ResponseEntity.ok("agendamento realizado com sucesso");
    }

    @GetMapping("/get")
    public ResponseEntity<List<Agendamento>> busca(){
        List<Agendamento> agendamentos = repository.findAll();
        return ResponseEntity.ok(agendamentos);
    }



}
