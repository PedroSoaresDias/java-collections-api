package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatoPorNome = new HashSet<>();

        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);
            }
        }

        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;

        for (Contato contato : contatoSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        System.out.println(" ");

        agendaContatos.adicionarContato("Pedro", 12345678);
        agendaContatos.adicionarContato("Pedro", 87654321);
        agendaContatos.adicionarContato("Pedro Dias", 13579246);
        agendaContatos.adicionarContato("Lucas", 97531864);
        agendaContatos.adicionarContato("Luiza", 35811569);
        agendaContatos.adicionarContato("Lucia", 54154512);

        agendaContatos.exibirContatos();

        System.out.println("\n" + agendaContatos.pesquisarPorNome("Pedro") + "\n");

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Luiza", 85955693));
    }
}
