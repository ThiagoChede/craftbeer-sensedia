package com.beerhouse.controller;

import com.beerhouse.service.CervejaService;
import com.beerhouse.model.Cerveja;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/craftbeer")
public class CervejaController {

private CervejaService cervejaService;

  @Autowired
private CervejaController(CervejaService cervejaService){
  this.cervejaService = cervejaService;
}

@PostMapping("/cerveja")
@ResponseBody
@ResponseStatus(code = HttpStatus.CREATED)
public Cerveja criaCerveja(@RequestBody Cerveja cerveja){
return this.cervejaService.criarCerveja(cerveja);
}

@DeleteMapping("{id}")
@ResponseStatus(HttpStatus.NO_CONTENT)
public void deletaCerveja(Cerveja cerveja){
this.cervejaService.deletaCerveja(cerveja);

}

@PatchMapping("{id}")
@ResponseBody
@ResponseStatus(code = HttpStatus.OK)
public Cerveja alteraCerveja(@RequestBody Cerveja cerveja, @PathVariable("id") Long id){

  return this.cervejaService.updateParcialCerveja(cerveja,id);
}

}
