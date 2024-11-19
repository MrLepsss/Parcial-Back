package com.finca.arriendo;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.finca.arriendo.dto.ContratoDto;

@Configuration
public class ModelMapperConfiguration {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.createTypeMap(Contrato.class, ContratoDto.class).addMappings(mapping -> {
            mapping.map(Contrato::getId, ContratoDto::setId);
            mapping.map(Contrato::getIdentificador, ContratoDto::setIdentificador);
            mapping.map(Contrato::getValor, ContratoDto::setValor);
            mapping.map(Contrato::getNombreContratante, ContratoDto::setNombreContratante);
            mapping.map(Contrato::getDocumentoContratante, ContratoDto::setDocumentoContratante);
            mapping.map(Contrato::getNombreContratista, ContratoDto::setNombreContratista);
            mapping.map(Contrato::getDocumentoContratista, ContratoDto::setDocumentoContratista);
            mapping.map(Contrato::getFechaInicial, ContratoDto::setFechaInicial);
            mapping.map(Contrato::getFechaFinal, ContratoDto::setFechaFinal);
        });

        return modelMapper;
    }
}
