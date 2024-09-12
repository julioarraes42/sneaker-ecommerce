package br.unitins.techtins.model.ecommerce;

import java.time.LocalDate;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Venda extends DefautEntity{
    
    private Double valorFinal;
    private String formaPagamento;
    private LocalDate data;
}
