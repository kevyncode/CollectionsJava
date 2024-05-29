package main.java.list.OperacoesBasicas.OrdenacaoPessoa;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criação da instância de OrdenacaoPessoa
        OrdenacaoPessoa operacoes = new OrdenacaoPessoa();

        // Adicionando pessoas
        operacoes.adicionarPessoa("Alice", 30, 1.65);
        operacoes.adicionarPessoa("Bob", 25, 1.80);
        operacoes.adicionarPessoa("Carlos", 28, 1.75);

        // Ordenando por idade
        List<Pessoa> pessoasPorIdade = operacoes.ordenarPorIdade();
        System.out.println("Ordenado por idade:");
        for (Pessoa pessoa : pessoasPorIdade) {
            System.out.println(pessoa);
        }

        // Ordenando por altura
        List<Pessoa> pessoasPorAltura = operacoes.ordenarPorAltura();
        System.out.println("\nOrdenado por altura:");
        for (Pessoa pessoa : pessoasPorAltura) {
            System.out.println(pessoa);
        }
    }
}
