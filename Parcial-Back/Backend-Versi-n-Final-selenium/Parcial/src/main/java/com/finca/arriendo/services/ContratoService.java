package com.finca.arriendo.services;

import org.modelmapper.ModelMapper;

import com.finca.arriendo.repository.ContratoRepository;

@Service
public class ContratoService {
    
    @Autowired
    private contratoRepositoy ContratoRepository;

    public ContratoDto get(Long id){
        Optional<Contrato> contrato = contratoRepository.findById();
        return contrato.map(value -> modelMapper.map(value, ContratoDto.class)).orElse(null);
    }

    public List<ContratoDto> list(){
        return contratoRepository.findAll().stream()
                .map(contrato -> modelMapper.map(contrato, ContratoDto.class))
                .collect(Collectors.toList());
    }
}
