package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(produtoSet);

        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 15, 5);
        cadastroProdutos.adicionarProduto(3L, "Produto 9", 17.59, 20);
        cadastroProdutos.adicionarProduto(4L, "Produto 6", 24.99, 25);

        System.out.println("Exibindo Produtos: \n\n" + cadastroProdutos.produtoSet);

        System.out.println("\nExibindo Produtos por Nome: \n\n" + cadastroProdutos.exibirProdutosPorNome() + "\n");

        System.out.println("Exibindo Produtos por Preço: \n\n " + cadastroProdutos.exibirProdutosPorPreco() + "\n");
    }
}
