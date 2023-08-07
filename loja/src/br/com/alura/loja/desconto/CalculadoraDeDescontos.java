package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*
PADRÃO DE PROJETO - CHAIN OF RESPONSABILITY
    É utilizado quando se tem várias regras, mas não se sabe qual vai ser aplicada. É necessário verificar qual será a regra aplicada.
    Como não se sabe qual a estratégia que será aplicada, é preciso verificar utilizando do fluxo do "proximo" caso alguma regra não se aplique.
        O a tradução de CHAIN OF RESPONSABILITY é CADEIA DE RESPONSABILIDADE. O algoritmo passa por niveis para encontrar a solução apropriada
        para o problema, pois os tipos exatos de solicitações e suas sequências são desconhecidos de antemão.
*/

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoOrcamentoMaisDeCincoItens( // primeiro
                new DescontoOrcamentoValorMaior( // segundo
                        new SemDesconto())); // final

        return desconto.calcular(orcamento);
    }
}
