package com.example.clinicaProjetoIntegrador.service.impl;

import com.example.clinicaProjetoIntegrador.entity.DentistaEntity;
import com.example.clinicaProjetoIntegrador.entity.PacienteEntity;
import com.example.clinicaProjetoIntegrador.repository.IPacienteRepository;
import com.example.clinicaProjetoIntegrador.service.IPacienteService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements IPacienteService<PacienteEntity> {

    private final IPacienteRepository pacienteRepository;

    public PacienteServiceImpl(IPacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    @Override
    public List<PacienteEntity> findAllPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<PacienteEntity> findPacienteById(int id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public PacienteEntity addPaciente(PacienteEntity pacienteEntity) {
        if (pacienteEntity != null){
            return pacienteRepository.save(pacienteEntity);
        }
        return new PacienteEntity();
    }

    @Override
    public String deletePaciente(int id) {
        if (pacienteRepository.findById(id).isPresent()){
            pacienteRepository.deleteById(id);
            return "Paciente deletado";
        }
        return "Paciente não encontrado";
    }

    @Override
    public String updatePaciente(PacienteEntity pacienteEntity) {
        if (pacienteEntity != null && pacienteRepository.findById(pacienteEntity.getId()).isPresent()){
            pacienteRepository.saveAndFlush(pacienteEntity);
            return "Paciente atualizado";
        }
        return "Não foi possível atualizar";
    }
}
