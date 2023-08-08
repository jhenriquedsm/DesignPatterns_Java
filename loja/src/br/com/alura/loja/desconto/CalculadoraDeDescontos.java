package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*
PADRÃO DE PROJETO - CHAIN OF RESPONSABILITY
    É utilizado quando se tem várias regras, mas não se sabe qual vai ser aplicada. É necessário verificar qual será a regra aplicada.
    Como não se sabe qual a estratégia que será aplicada, é preciso verificar utilizando do fluxo do "proximo" caso alguma regra não se aplique.
        O a tradução de CHAIN OF RESPONSABILITY é CADEIA DE RESPONSABILIDADE. O algoritmo passa por niveis para encontrar a solução apropriada
        para o problema, pois os tipos exatos de solicitações e suas sequências são desconhecidos de antemão.

PADRÃO DE PROJETO - TEMPLATE METHOD
        Favorece o reaproveitamento de códigos comuns entre classes, evitando duplicações de códigos.
        O Template Method define o esqueleto de um algoritmo na superclasse, mas deixa as subclasses sobrescreverem etapas específicas
        do algoritmo sem modificar a estrutura.
*/

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoOrcamentoMaisDeCincoItens( // primeiro
                new DescontoOrcamentoValorMaior( // segundo
                        new SemDesconto())); // final

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
