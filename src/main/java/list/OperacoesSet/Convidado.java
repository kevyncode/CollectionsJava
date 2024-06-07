package main.java.list.OperacoesSet;

public class Convidado {

    // Atributos privados para armazenar o nome do convidado e o código do convite
    private final String nome;
    private final int codigoConvite;

    /**
     * Construtor da classe Convidado.
     * Inicializa um novo objeto Convidado com o nome e o código do convite fornecidos.
     *
     * @param nome          O nome do convidado.
     * @param codigoConvite O código do convite.
     */
    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    /**
     * Obtém o nome do convidado.
     *
     * @return O nome do convidado.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Obtém o código do convite.
     *
     * @return O código do convite.
     */
    public int getCodigoConvite() {
        return codigoConvite;
    }

    /**
     * Retorna uma representação em String do objeto Convidado.
     * Isso é útil para depuração e para imprimir informações do convidado.
     *
     * @return Uma string que representa o objeto Convidado.
     */
    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}
