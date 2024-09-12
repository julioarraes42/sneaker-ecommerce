package br.unitins.techtins.model.ecommerce;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Pedido extends DefautEntity{
    
    private Integer quantidade;
    private Double valor;
    private Double desconto;
}
