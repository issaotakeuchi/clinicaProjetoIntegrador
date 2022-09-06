package com.example.clinicaProjetoIntegrador.controller;

import com.example.clinicaProjetoIntegrador.entity.DentistaEntity;
import com.example.clinicaProjetoIntegrador.service.impl.DentistaServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DentistaController {
    private final DentistaServiceImpl dentistaService;

    public DentistaController(DentistaServiceImpl dentistaService) {
        this.dentistaService = dentistaService;
    }

    @RequestMapping(value = "/dentistas", method = RequestMethod.GET, produces = "application/json")
    public List<DentistaEntity> buscarTodosDentistas(){
        return dentistaService.findAllDentistas();
    }

    @GetMapping("/dentista/{id}")
    public Optional<DentistaEntity> buscarDentistaPorId(@PathVariable int id){
        return dentistaService.findDentistaById(id);
    }

    @PostMapping("/dentista/adicionar")
    public DentistaEntity adicionarDentista(@RequestBody DentistaEntity dentistaEntity){
        return dentistaService.addDentista(dentistaEntity);
    }

    @DeleteMapping("/dentista/delete/{id}")
    public String deleteDentista(@PathVariable int id){
        return dentistaService.deleteDentista(id);
    }

    @PutMapping("/dentista/atualizar")
    public String atualizarDentista(@RequestBody DentistaEntity dentistaEntity){
        return dentistaService.updateDentista(dentistaEntity);
    }
}
