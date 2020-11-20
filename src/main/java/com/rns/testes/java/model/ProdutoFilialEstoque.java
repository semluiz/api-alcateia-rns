package com.rns.testes.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "PRODUTO_SALDO_FILIAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoFilialEstoque extends GenericEntity<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUTO_ID", nullable = true)
    private Produto produto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FILIAL_ID", nullable = true)
    private Filial filial;

    @Column(name = "QUANTIDADE")
    private Double quantidade;


}
