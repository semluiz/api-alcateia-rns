package com.rns.testes.java.service.impl;

import com.rns.testes.java.dao.IProdutoDao;
import com.rns.testes.java.dao.IProdutoFilialEstoqueDao;
import com.rns.testes.java.model.Produto;
import com.rns.testes.java.model.ProdutoFilialEstoque;
import com.rns.testes.java.service.AbstractGenericServicePersistence;
import com.rns.testes.java.service.IProdutoFilialService;
import com.rns.testes.java.service.IProdutoService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoFilialService extends AbstractGenericServicePersistence<IProdutoFilialEstoqueDao, ProdutoFilialEstoque, Long> implements IProdutoFilialService {
}
