package com.api.clubhairproapi.Repositories;

import com.api.clubhairproapi.Entities.Profissional;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfissionalRepository extends JpaRepository<Profissional, UUID> {
    boolean existsBycpf(String cpf);
}
