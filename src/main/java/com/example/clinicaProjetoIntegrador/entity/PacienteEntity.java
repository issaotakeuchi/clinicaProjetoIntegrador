package com.example.clinicaProjetoIntegrador.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String nome;
    private String sobrenome;
    private String endereco;
    private String rg;
    private Date dataDeAlta;
}
