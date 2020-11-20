package com.rns.testes.java.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.rns.testes.java.dto.ProdutoFilialEstoqueDto;
import com.rns.testes.java.dto.mapper.IProdutoFilialMapper;

import com.rns.testes.java.model.ProdutoFilialEstoque;
import com.rns.testes.java.model.ProdutoFilialResponse;
import com.rns.testes.java.repository.ProdutoFilialRepository;
import com.rns.testes.java.service.IProdutoFilialService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import java.util.List;

@RestController

@ToString
@JsonIgnoreProperties
public class ProdutoFilialController {

    private static final String BASE_URL = "controle-estoque/";


    @Autowired
    IProdutoFilialService produtoService;

    @Autowired
    ProdutoFilialRepository repository;

    private final EntityManager em;

    public ProdutoFilialController(EntityManager em) {
        this.em = em;
    }

    @GetMapping(value = BASE_URL + "produto-filial", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public List<Object[]> getJoinedInfo() {
        try {
            List<Object[]> response = em.createQuery("select p.nome, f.razaoSocial, f.tipoFilial, pfe.quantidade from ProdutoFilialEstoque pfe Join pfe.filial f join pfe.produto p",
                    Object[].class)
                    .getResultList();

            return response;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    // Relacionando as outras entidades
    @PostMapping(value = BASE_URL + "insert", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ProdutoFilialEstoque> insert(@RequestBody ProdutoFilialEstoque dto) {
        try {
            produtoService.save(dto);
            return ResponseEntity.ok(dto);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(dto, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    // OK
    @GetMapping(value = BASE_URL + "find-all", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<List<?>> findAll() {
        try {
            return ResponseEntity.ok(produtoService.findAll());
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    // OK
    @GetMapping(value = BASE_URL + "find-by-id", produces = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ProdutoFilialEstoque> findById(@RequestParam(name = "id") Long id) {
        try{
            return ResponseEntity.ok(produtoService.findById(id));
        }catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Removendo a registro
    @DeleteMapping(value = BASE_URL + "delete", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void delete(@RequestParam(name = "id") Long id) {
        try {
            produtoService.delete(id);
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Atualiza qualquer propriedade do objeto, inclusive a sua filial e quantidade
    @PutMapping(value = BASE_URL + "update", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ResponseEntity<ProdutoFilialEstoque> update(@RequestBody ProdutoFilialEstoqueDto dto) {
        try{
            return ResponseEntity.ok(produtoService.update(IProdutoFilialMapper.INSTANCE.dtoToEntity(dto)));
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
