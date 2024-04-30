package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calculaValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                valorTotalEstoque += produto.getQuantidade() * produto.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;

        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto produto : estoqueProdutoMap.values()) {
                if (produto.getPreco() > maiorPreco) {
                    maiorPreco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }

        return produtoMaisCaro;
    }
    
    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1L, "Produto A", 5.0, 10);
        estoqueProdutos.adicionarProduto(2L, "Produto B", 10.0, 5);
        estoqueProdutos.adicionarProduto(3L, "Produto C", 15.0, 2);
        estoqueProdutos.adicionarProduto(4L, "Produto D", 2.0, 1);

        estoqueProdutos.exibirProdutos();

        System.out.println("\nValor total do estoque: R$" + estoqueProdutos.calculaValorTotalEstoque() + "\n");
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
    }
}
