package com.beerhouse.repository;

import com.beerhouse.model.Cerveja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CervejaRepository extends CrudRepository<Cerveja, Long>{

  <T extends Cerveja> T save(T cerveja);

  Optional<Cerveja> findByNome(String nome);


  Optional<Cerveja> findById(Long idCerveja);

}
