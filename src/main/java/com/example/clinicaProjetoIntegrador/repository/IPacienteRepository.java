package com.example.clinicaProjetoIntegrador.repository;

import com.example.clinicaProjetoIntegrador.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPacienteRepository extends JpaRepository<PacienteEntity, Integer> {
}
