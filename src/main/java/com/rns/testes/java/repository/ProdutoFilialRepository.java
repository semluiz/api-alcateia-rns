package com.rns.testes.java.repository;


import com.rns.testes.java.model.ProdutoFilialEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoFilialRepository extends JpaRepository<ProdutoFilialEstoque, Long> {


}
