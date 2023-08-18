package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

/*
PADRÃO DE PROJETO - OBSERVER
    - Permite definir um mecanismo de assinatura para notificar múltiplos objetos sobre quaisquer eventos que
    aconteçam com o objeto que eles estão observando.
    - Classes que ficam observando determinada ação e quando é chamada executa uma ação.
    - Dimuição de aclopamento
*/

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido{

    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados!");
    }
}
