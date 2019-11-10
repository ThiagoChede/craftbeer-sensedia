package com.beerhouse.exception;

public class CervejaJaEncontradaException extends javax.persistence.NonUniqueResultException {

  public CervejaJaEncontradaException() {
    super("cerveja não encontrado!");
  }
  public CervejaJaEncontradaException(String msg) {
    super(msg);
  }
  }

