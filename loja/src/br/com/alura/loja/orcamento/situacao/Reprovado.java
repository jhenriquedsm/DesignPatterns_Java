package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends Situacao{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
;    }
}
