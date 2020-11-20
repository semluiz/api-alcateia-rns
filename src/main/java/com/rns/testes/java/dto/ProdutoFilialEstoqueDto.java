package com.rns.testes.java.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
@ToString
@Data
public class ProdutoFilialEstoqueDto {
    private Long id;
    private Produto produto;
    private Filial filial;
    private Double quantidade;
}
