package com.finca.arriendo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finca.arriendo.model.Contrato;

@Repository
public class ContratoRepository extends JpaRepository<Contrato, Long>{
    
}
