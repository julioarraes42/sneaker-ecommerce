package br.unitins.techtins.model.pessoa;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Funcionario extends DefautEntity{
    
    private String cargo;
    
}
