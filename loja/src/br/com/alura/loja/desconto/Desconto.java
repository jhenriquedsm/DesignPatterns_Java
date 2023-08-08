package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto { // classe mãe

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
/*
PADRÃO DE PROJETO - TEMPLATE METHOD
    -> agora a classe mãe é responsável pelo processo de delegação de verificar e calcular o desconto.
    no template method, a classe mãe faz parte do processo e outra parte ela delega.
*/
    public BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }
        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract boolean deveAplicar(Orcamento orcamento);
}
