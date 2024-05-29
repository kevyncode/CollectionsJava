package main.java.list.OperacoesBasicas.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um catálogo de livros.
 */
public class CatalogoLivros {

    // Atributos
    private List<Livro> livroList;

    /**
     * Construtor para criar um catálogo de livros.
     */
    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    /**
     * Adiciona um livro ao catálogo.
     *
     * @param titulo o título do livro
     * @param autor o autor do livro
     * @param anoPublicacao o ano de publicação do livro
     */
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    /**
     * Pesquisa livros por autor.
     *
     * @param autor o autor a ser pesquisado
     * @return uma lista de livros do autor especificado
     */
    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                livrosPorAutor.add(l);
            }
        }
        return livrosPorAutor;
    }

    /**
     * Pesquisa livros por intervalo de anos de publicação.
     *
     * @param anoInicial o ano inicial do intervalo
     * @param anoFinal o ano final do intervalo
     * @return uma lista de livros publicados no intervalo especificado
     */
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        for (Livro l : livroList) {
            if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervaloAno.add(l);
            }
        }
        return livrosPorIntervaloAno;
    }

    /**
     * Pesquisa um livro por título.
     *
     * @param titulo o título do livro a ser pesquisado
     * @return o livro com o título especificado ou null se não encontrado
     */
    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro l : livroList) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                return l;
            }
        }
        return null;
    }
}
