package com.rns.testes.java.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rns.testes.java.enums.EnumTipoFilial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties
public class ProdutoEstoqueResponse {
    private String nome;
    private String razaoSocial;
    private EnumTipoFilial tipoFilial;
    private BigDecimal quantidade;
}
