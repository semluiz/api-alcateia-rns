package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.FilialDto;
import com.rns.testes.java.dto.ProdutoFilialEstoqueDto;
import com.rns.testes.java.model.Filial;
import com.rns.testes.java.model.ProdutoFilialEstoque;
import com.rns.testes.java.service.IGenericService;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IProdutoFilialMapper extends GenericMapper<ProdutoFilialEstoque, ProdutoFilialEstoqueDto> {

    IProdutoFilialMapper INSTANCE = Mappers.getMapper(IProdutoFilialMapper.class);

}
