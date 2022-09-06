package com.example.clinicaProjetoIntegrador.service;

import java.util.List;
import java.util.Optional;

public interface IDentistaService <T>{
    public List<T> findAllDentistas();
    public Optional<T> findDentistaById(int id);
    public T addDentista(T t);
    public String deleteDentista(int id);
    public String updateDentista(T t);
}
