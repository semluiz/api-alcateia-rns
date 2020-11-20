package com.rns.testes.java.seeder;

import com.rns.testes.java.enums.EnumTipoFilial;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.Produto;
import com.rns.testes.java.model.ProdutoFilialEstoque;
import com.rns.testes.java.service.IProdutoFilialService;
import com.rns.testes.java.service.IProdutoService;
import com.rns.testes.java.service.impl.FilialService;
import com.rns.testes.java.service.impl.ProdutoService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.mapstruct.AfterMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class ProdutoEstoqueSeeder {
    @Autowired
    IProdutoFilialService produtoFilialService;

    @Autowired
    FilialService filialService;

    @Autowired
    ProdutoService produtoService;


    @EventListener
    public void seedFilial(ContextRefreshedEvent event) {
        try {
            log.info("relacionando Produtos e Filials....");
            criandoFiliais();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    @AfterMapping
    private void criandoFiliais() {

        Produto produto1 = produtoService.findById("Cod-Produto-1");
        Produto produto2 = produtoService.findById("Cod-Produto-2");

        Filial filial = filialService.findById(1L);
        Filial filial2 = filialService.findById(2l);

        ProdutoFilialEstoque pfe = new ProdutoFilialEstoque();
        pfe.setProduto(produto1);
        pfe.setFilial(filial);
        produtoFilialService.save(pfe);

        ProdutoFilialEstoque pfe2 = new ProdutoFilialEstoque();
        pfe.setProduto(produto2);
        pfe.setFilial(filial2);
        produtoFilialService.save(pfe2);



    }
}
