package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

public class Aprovado extends Situacao {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
