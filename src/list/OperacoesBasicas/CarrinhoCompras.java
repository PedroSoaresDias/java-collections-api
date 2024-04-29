package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinho;

    public CarrinhoCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemSerRemovido = new ArrayList<>();
        for (Item item : carrinho) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemSerRemovido.add(item);
            }
        }

        carrinho.removeAll(itemSerRemovido);
    }

    public double calcularValorTotal() {
        double valorTotal = carrinho.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuantidade())
                .sum();
        
        return valorTotal;
    }

    public void exibirItems() {
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoCompras compras = new CarrinhoCompras();
        
        System.out.println("Itens no carrinho de compras: \n");

        compras.adicionarItem("Pilhas recarregaveis", 25, 5);
        compras.adicionarItem("HD Externo 1TB", 275, 2);
        compras.adicionarItem("Parafusadera", 120, 1);
        compras.adicionarItem("Pasta Termica de Prata", 15, 21);

        compras.exibirItems();

        System.out.println("\n Itens a serem removidos do carrinho: \n");

        compras.removerItem("Parafusadera");

        compras.exibirItems();

        System.out.println("\n Total do Carrinho: " + compras.calcularValorTotal() + "\n");

        System.out.println("\n Todos os items do Carrinho de Compras: \n");

        compras.exibirItems();
    }
}
