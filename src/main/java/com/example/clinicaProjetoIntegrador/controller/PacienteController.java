package com.example.clinicaProjetoIntegrador.controller;

import com.example.clinicaProjetoIntegrador.entity.DentistaEntity;
import com.example.clinicaProjetoIntegrador.entity.PacienteEntity;
import com.example.clinicaProjetoIntegrador.service.impl.DentistaServiceImpl;
import com.example.clinicaProjetoIntegrador.service.impl.PacienteServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PacienteController {
    private final PacienteServiceImpl pacienteService;

    public PacienteController(PacienteServiceImpl pacienteService) {
        this.pacienteService = pacienteService;
    }

    @RequestMapping(value = "/pacientes", method = RequestMethod.GET, produces = "application/json")
    public List<PacienteEntity> buscarTodosPacientes(){
        return pacienteService.findAllPacientes();
    }

    @GetMapping("/paciente/{id}")
    public Optional<PacienteEntity> buscarPacientePorId(@PathVariable int id){
        return pacienteService.findPacienteById(id);
    }

    @PostMapping("/paciente/adicionar")
    public PacienteEntity adicionarPaciente(@RequestBody PacienteEntity pacienteEntity){
        return pacienteService.addPaciente(pacienteEntity);
    }

    @DeleteMapping("/paciente/delete/{id}")
    public String deletePaciente(@PathVariable int id){
        return pacienteService.deletePaciente(id);
    }

    @PutMapping("/paciente/atualizar")
    public String atualizarPaciente(@RequestBody PacienteEntity pacienteEntity){
        return pacienteService.updatePaciente(pacienteEntity);
    }
}
