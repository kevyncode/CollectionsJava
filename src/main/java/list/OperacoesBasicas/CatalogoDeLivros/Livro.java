package main.java.list.OperacoesBasicas.CatalogoDeLivros;

// Representa um livro no catálogo.
public class Livro {
    // Atributos
    private final String titulo;
    private final String autor;
    private final int anoPublicacao;

    // Construtor para criar um livro.

    public Livro(String titulo, String autor, int anoPublicacao) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("O autor não pode ser nulo ou vazio.");
        }
        if (anoPublicacao <= 0) {
            throw new IllegalArgumentException("O ano de publicação deve ser um valor positivo.");
        }

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Retorna o título do livro.
    public String getTitulo() {
        return titulo;
    }

    // Retorna o autor do livro.
    public String getAutor() {
        return autor;
    }

    // Retorna o ano de publicação do livro.
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
