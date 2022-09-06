package com.example.clinicaProjetoIntegrador.repository;

import com.example.clinicaProjetoIntegrador.entity.DentistaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDentistaRepository extends JpaRepository<DentistaEntity, Integer> {
}
