package main.java.list.OperacoesSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    // Conjunto que armazena objetos do tipo Convidado
    private final Set<Convidado> convidadoSet;

    /**
     * Construtor da classe ConjuntoConvidados.
     * Inicializa o conjunto de convidados como um HashSet.
     */
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    /**
     * Adiciona um novo convidado ao conjunto.
     *
     * @param nome          O nome do convidado.
     * @param codigoConvite O código do convite.
     */
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    /**
     * Remove um convidado do conjunto pelo código do convite.
     *
     * @param codigoConvite O código do convite do convidado a ser removido.
     */
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    /**
     * Conta quantos convidados estão presentes no conjunto.
     *
     * @return O número de convidados no conjunto.
     */
    public int contarConvidados() {
        return convidadoSet.size();
    }

    /**
     * Exibe todos os convidados presentes no conjunto.
     */
    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }
}
