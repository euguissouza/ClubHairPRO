package com.api.clubhairproapi.Repositories;

import com.api.clubhairproapi.Entities.Agendamento;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
    boolean horaAgendamento(LocalDate dataAgendamento, LocalTime horaAgendamento);
}
