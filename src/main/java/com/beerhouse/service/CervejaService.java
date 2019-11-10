package com.beerhouse.service;

import com.beerhouse.utils.BeansUtil;
import com.beerhouse.exception.CervejaJaEncontradaException;
import com.beerhouse.exception.CervejaNaoEncontradoException;
import com.beerhouse.model.Cerveja;
import com.beerhouse.repository.CervejaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class CervejaService {

private CervejaRepository cervejaRepository;

public CervejaService(CervejaRepository cervejaRepository){
  this.cervejaRepository = cervejaRepository;

}

  /**
   * Método reponsável por criar uma cerveja a partir dos dados básicos.
   */

public Cerveja criarCerveja(Cerveja cerveja){


  log.info("Cadastro de cerveja: " + cerveja);

  if (cerveja.getNome().equals(this.cervejaRepository.findByNome(cerveja.getNome()))){

    throw new CervejaJaEncontradaException("Cerveja já cadastrada");
  }

  return this.cervejaRepository.save(cerveja);
}


  public void deletaCerveja(Cerveja cerveja) {
  cervejaRepository.delete(cerveja);

  }


  public Cerveja updateParcialCerveja(Cerveja cerveja, Long id) {
    Cerveja cervejaBanco = this.buscaPorId(id);

    BeansUtil<Cerveja> bean = new BeansUtil<>();

    Cerveja cervejaNova = bean.copyNonNullProperties(cerveja, cervejaBanco);

    return this.save(cervejaNova);

  }

  public Cerveja buscaPorId(Long idCerveja) {
    return this.cervejaRepository.findById(idCerveja).orElseThrow(CervejaNaoEncontradoException::new);
  }

  public Cerveja save(Cerveja cerveja) {
    return this.cervejaRepository.save(cerveja);
  }



}



