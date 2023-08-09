package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;
import java.math.BigDecimal;

/*
PADRÃO DE PROJETO - STATE
    É utilizado quando tem alguma transição de estado ou quando é preciso aplicar alguma regra no algoritmo baseado no estado
    de algum objeto/classe.
    Permite que um objeto altere seu comportamento quando seu estado interno muda.
    É semelhante ao Strategy.
        - Transições de estados
*/

public abstract class Situacao {
    public BigDecimal calcularValorDescontoExtra (Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser aprovado!");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser finalizado!");
    }
}
