package com.finca.arriendo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import com.finca.arriendo.dto.ContratoDto;
import com.finca.arriendo.services.ContratoService;

@RestController
@RequestMapping("api/contrato")
@CrossOrigin(origins = "localhost:4200")
public class ContratoController {
    
    @Autowired
    private ContratoService contratoService;

    @GetMapping("/list")
    public ResponseEntity<List<ContratoDto>> getAll(){
        try{
            List<ContratoDto> contratos = contratoService.list();
            return new ResponseEntity<>(contratos, HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ContratoDto> getById(@PathVariable Long id){
        try{
            ContratoDto contrato = contratoService.get(id);
            if (contrato != null) {
                return new ResponseEntity<>(finca, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
