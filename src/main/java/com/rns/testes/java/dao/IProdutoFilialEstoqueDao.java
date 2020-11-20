package com.rns.testes.java.dao;

import com.rns.testes.java.model.ProdutoFilialEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProdutoFilialEstoqueDao extends JpaRepository<ProdutoFilialEstoque, Long> {
}
