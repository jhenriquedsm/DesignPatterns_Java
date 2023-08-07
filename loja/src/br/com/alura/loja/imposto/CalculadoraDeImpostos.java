package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*
PADRÃO DE PROJETO - STRATEGY
    Cria-se uma estratégia a fim de evitar um código cheio de "if e else" que cresce cada vez mais de acordo com a necessidade de
    novas implementações.
    Deixa o código mais coeso, fazendo a calculadora estar vinculada somente a interface.
        - deixa o código menor e menos dependente;
    O Strategy visa resolver o problema de diversos algoritmos para uma ação que resulta na possibilidade de vários ifs.
*/

public class CalculadoraDeImpostos {
    public BigDecimal calcular (Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
