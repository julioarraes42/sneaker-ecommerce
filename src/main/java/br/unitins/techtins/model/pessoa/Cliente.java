package br.unitins.techtins.model.pessoa;

import br.unitins.techtins.model.DefautEntity;
import jakarta.persistence.Entity;

@Entity
public class Cliente extends DefautEntity{

    private String endereco;

}
