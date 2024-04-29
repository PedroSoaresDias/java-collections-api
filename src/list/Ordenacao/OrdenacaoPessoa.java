package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorIdade);

        return pessoaPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);

        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

        return pessoaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoas("Nome 1", 20, 1.65);
        ordenacaoPessoa.adicionarPessoas("Nome 2", 18, 1.62);
        ordenacaoPessoa.adicionarPessoas("Nome 3", 21, 1.72);
        ordenacaoPessoa.adicionarPessoas("Nome 4", 19, 1.68);
        ordenacaoPessoa.adicionarPessoas("Nome 5", 17, 1.60);

        System.out.println("Ordenação de Pessoas: \n");

        System.out.println(ordenacaoPessoa.pessoaList + "\n");

        System.out.println("Ordenação de Pessoas por Idade: \n");

        System.out.println(ordenacaoPessoa.ordenarPorIdade() + "\n");

        System.out.println("Ordenação de Pessoas por Idade: \n");

        System.out.println(ordenacaoPessoa.ordernarPorAltura() + "\n");
    }
}
