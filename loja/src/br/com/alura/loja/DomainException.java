package br.com.alura.loja;

public class DomainException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public DomainException(String messagem) {
        super(messagem);
    }
}
