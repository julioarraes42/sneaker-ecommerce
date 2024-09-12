package br.unitins.techtins.model.pessoa;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Pessoa extends DefautEntity{
    
    private String nome;
    private String email;
    private String cpf;
    private String status;
}
