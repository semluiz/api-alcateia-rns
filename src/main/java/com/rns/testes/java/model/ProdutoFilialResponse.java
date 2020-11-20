package com.rns.testes.java.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
@ToString
public class ProdutoFilialResponse {

    private String nome;

    private String razaoSocial;
}
