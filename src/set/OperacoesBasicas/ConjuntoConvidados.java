package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado convidado : convidadoSet) {
            if (convidado.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = convidado;
                break;
            }
        }

        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados \n");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 4002);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1080);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 2160);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 5678);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 4321);
        conjuntoConvidados.adicionarConvidado("Convidado 7", 1440);

        System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados \n");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);

        System.out.println("\nExistem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados \n");

        conjuntoConvidados.exibirConvidados();
    }
}
