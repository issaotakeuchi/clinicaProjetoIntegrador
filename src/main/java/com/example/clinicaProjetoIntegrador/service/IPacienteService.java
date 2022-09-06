package com.example.clinicaProjetoIntegrador.service;

import java.util.List;
import java.util.Optional;

public interface IPacienteService <T>{
    public List<T> findAllPacientes();
    public Optional<T> findPacienteById(int id);
    public T addPaciente(T t);
    public String deletePaciente(int id);
    public String updatePaciente(T t);
}
