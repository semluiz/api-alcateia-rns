package com.rns.testes.java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUTO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto extends GenericEntity<String> {

    @Id
    private String id;

    @Column
    private String nome;




}
