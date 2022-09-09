package biblioteca;

public class Biblioteca implements IBiblioteca {

    private Pessoa pessoa;
    private EstoqueLivro livro;

    public Biblioteca (Pessoa pessoa, EstoqueLivro livro) {
        this.pessoa = pessoa;
        this.livro = livro;
    }

    public void retiraLivro() {

        // quando estudante retira

        // quando professor retira
    };

    public void devolveLivro() {
        // quando estudante devolve

        // quando professor devolve
    };

    public static void main(String[] args) {

        // apresentar menu ao usuário
            // devolver livro
            // retirar livro
            // listar Livros
            // encerrar
    }
}
