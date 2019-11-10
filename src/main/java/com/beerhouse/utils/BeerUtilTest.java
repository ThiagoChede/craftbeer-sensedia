package com.beerhouse.utils;

import com.beerhouse.model.Cerveja;
import com.beerhouse.service.CervejaService;
import org.junit.Assert;
import org.junit.Test;

public class BeerUtilTest {
private CervejaService cervejaService;



  @Test
  public void updateBeer(){

    //WHEN
    Cerveja cerveja = new Cerveja();
    cerveja.setId(1);
    cerveja.setCervejaria("Berggren");
    cerveja.setDescricao("A Cervejinha do domingo");
    cerveja.setNome("Skol");

    //THEN
    Assert.assertNotNull(cerveja);

  }

}
