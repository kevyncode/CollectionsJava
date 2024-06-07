package main.java.list.OperacoesSet;

public class Main {

    public static void main(String[] args) {
        // Cria um objeto ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        // Adiciona alguns convidados ao conjunto
        conjuntoConvidados.adicionarConvidado("Alice", 101);
        conjuntoConvidados.adicionarConvidado("Bob", 102);
        conjuntoConvidados.adicionarConvidado("Carlos", 103);

        // Exibe os convidados
        System.out.println("Convidados após adição:");
        conjuntoConvidados.exibirConvidados();

        // Conta e exibe o número de convidados
        System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());

        // Remove um convidado pelo código do convite
        conjuntoConvidados.removerConvidadoPorCodigoConvite(102);

        // Exibe os convidados após a remoção
        System.out.println("Convidados após remoção:");
        conjuntoConvidados.exibirConvidados();

        // Conta e exibe o número de convidados novamente
        System.out.println("Número de convidados: " + conjuntoConvidados.contarConvidados());
    }
}
