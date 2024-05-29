package main.java.list.OperacoesBasicas.CatalogoDeLivros;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Cria um catálogo de livros
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adiciona alguns livros ao catálogo
        catalogo.adicionarLivro("1984", "George Orwell", 1949);
        catalogo.adicionarLivro("Animal Farm", "George Orwell", 1945);
        catalogo.adicionarLivro("Brave New World", "Aldous Huxley", 1932);
        catalogo.adicionarLivro("Fahrenheit 451", "Ray Bradbury", 1953);

        // Pesquisa por autor
        System.out.println("Livros de George Orwell:");
        List<Livro> livrosOrwell = catalogo.pesquisarAutor("George Orwell");
        for (Livro livro : livrosOrwell) {
            System.out.println(livro);
        }

        // Pesquisa por intervalo de anos
        System.out.println("\nLivros publicados entre 1940 e 1950:");
        List<Livro> livros1940_1950 = catalogo.pesquisarPorIntervaloAnos(1940, 1950);
        for (Livro livro : livros1940_1950) {
            System.out.println(livro);
        }

        // Pesquisa por título
        System.out.println("\nPesquisa pelo título 'Brave New World':");
        Livro livroHuxley = catalogo.pesquisarPorTitulo("Brave New World");
        if (livroHuxley != null) {
            System.out.println(livroHuxley);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
