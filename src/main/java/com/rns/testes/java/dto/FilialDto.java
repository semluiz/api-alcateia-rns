package com.rns.testes.java.dto;

import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.GenericEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilialDto extends GenericEntity<Long> {

    private Long id;
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private EnumTipoFilial tipoFilial;

}
