package com.beerhouse.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name="Cervejas")
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class Cerveja {

  @Id
  @GeneratedValue
  @Column(name="id")
  private long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "descricao")
  private String descricao;

  @Column(name = "cervejaria")
  private String cervejaria;

  @Column(name = "tipo")
  private TipoCervejaEnum tipo;






}
