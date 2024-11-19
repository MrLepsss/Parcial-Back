package com.finca.arriendo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class ContratoDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private string identificador;
    private float valor;
    private string nombreContratante;
    private string documentoContratante;
    private string nombreContratista;
    private string documentoContratista;
    private Date fechaInicial;
    private Date fechaFinal;
}
