package biblioteca;

import java.util.ArrayList;

public class Livro extends Material {

    // titulo
    // isbn
    // autor

    private final int isbn;
    private final String autor;

    public Livro (String titulo, int isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String toString() {
        return this.titulo + " " + this.isbn + " " + this.autor;
    }

    protected void listarLivros(ArrayList<Livro> livros) {
        for (int i = 0; i < livros.size() ; i++) {
            System.out.println(livros.get(i));
        }
    }
}
