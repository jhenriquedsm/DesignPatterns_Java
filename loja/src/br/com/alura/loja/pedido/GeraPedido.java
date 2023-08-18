package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/*
PADRÃO DE PROJETO - COMMAND
    - transforma um pedido em um objeto independente que contém toda a informação do pedido.
    - é utilizado quando se tem várias classes e cada classe vai utilizar um método em comum
        - um método que executa um comando, uma lógica.
    - separação melhor dos dados e dependencias no comando.
        - melhor opção para parametrizar objetos com operações, permitindo colocar operações em filas,
        agendar a execução ou executá-las remotamente.
*/

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public String getCliente() {
        return cliente;
    }
    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }
    public int getQuantidadeIntens() {
        return quantidadeItens;
    }
}
