package com.rns.testes.java.dto;

import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDto {

    private Long id;

    private Produto produto;

    private Filial filial;

    private BigDecimal quantidade;
}
