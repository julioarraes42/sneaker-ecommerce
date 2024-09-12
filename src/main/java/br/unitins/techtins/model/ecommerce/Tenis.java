package br.unitins.techtins.model.ecommerce;

import java.time.LocalDate;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Tenis extends DefautEntity{
    
    private Integer numeracao;
    private String marca;
    private String modelo;
    private Integer estoque;
    private LocalDate data;
}
