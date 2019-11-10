package com.beerhouse.exception;

public class CervejaNaoEncontradoException extends NotFoundException{


  public CervejaNaoEncontradoException() {
    super("cerveja não encontrada!");
  }
  public CervejaNaoEncontradoException(String msg) {
    super(msg);
  }
}
