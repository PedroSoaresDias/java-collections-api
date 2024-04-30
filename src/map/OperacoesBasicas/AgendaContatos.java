package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;

        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }

        return numeroPorNome;
    }
    
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Pedro", 12345678);
        agendaContatos.adicionarContato("Pedro", 87654321);
        agendaContatos.adicionarContato("Pedro Dias", 13579246);
        agendaContatos.adicionarContato("Lucas", 97531864);
        agendaContatos.adicionarContato("Luiza", 35811569);
        agendaContatos.adicionarContato("Lucia", 54154512);

        agendaContatos.exibirContatos();

        System.out.println("\n");

        agendaContatos.removerContato("Lucia");

        agendaContatos.exibirContatos();

        System.out.println("\n");

        System.out.println("O número é: " + agendaContatos.pesquisarPorNome("Pedro Dias"));
    }
}
