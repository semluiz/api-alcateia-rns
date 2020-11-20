package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.ProdutoFilialEstoqueDto;
import com.rns.testes.java.model.ProdutoFilialEstoque;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-20T11:50:44-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class IProdutoFilialMapperImpl implements IProdutoFilialMapper {

    @Override
    public ProdutoFilialEstoqueDto entityToDto(ProdutoFilialEstoque entity) {
        if ( entity == null ) {
            return null;
        }

        ProdutoFilialEstoqueDto produtoFilialEstoqueDto = new ProdutoFilialEstoqueDto();

        produtoFilialEstoqueDto.setId( entity.getId() );
        produtoFilialEstoqueDto.setProduto( entity.getProduto() );
        produtoFilialEstoqueDto.setFilial( entity.getFilial() );
        produtoFilialEstoqueDto.setQuantidade( entity.getQuantidade() );

        return produtoFilialEstoqueDto;
    }

    @Override
    public ProdutoFilialEstoque dtoToEntity(ProdutoFilialEstoqueDto dto) {
        if ( dto == null ) {
            return null;
        }

        ProdutoFilialEstoque produtoFilialEstoque = new ProdutoFilialEstoque();

        produtoFilialEstoque.setId( dto.getId() );
        produtoFilialEstoque.setProduto( dto.getProduto() );
        produtoFilialEstoque.setFilial( dto.getFilial() );
        produtoFilialEstoque.setQuantidade( dto.getQuantidade() );

        return produtoFilialEstoque;
    }
}
