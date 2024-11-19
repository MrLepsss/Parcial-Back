package com.finca.arriendo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contrato {
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
