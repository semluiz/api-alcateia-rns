package com.rns.testes.java.dto.mapper;

import com.rns.testes.java.dto.ProdutoDto;
import com.rns.testes.java.model.Produto;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-11-20T11:38:32-0300",
    comments = "version: 1.3.0.Beta2, compiler: javac, environment: Java 1.8.0_261 (Oracle Corporation)"
)
public class ProdutoMapperImpl implements ProdutoMapper {

    @Override
    public ProdutoDto entityToDto(Produto entity) {
        if ( entity == null ) {
            return null;
        }

        ProdutoDto produtoDto = new ProdutoDto();

        if ( entity.getId() != null ) {
            produtoDto.setId( Long.parseLong( entity.getId() ) );
        }

        return produtoDto;
    }

    @Override
    public Produto dtoToEntity(ProdutoDto dto) {
        if ( dto == null ) {
            return null;
        }

        Produto produto = new Produto();

        if ( dto.getId() != null ) {
            produto.setId( String.valueOf( dto.getId() ) );
        }

        return produto;
    }
}
