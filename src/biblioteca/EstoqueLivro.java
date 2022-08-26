package biblioteca;

public class EstoqueLivro {

    // isbnLivro;
    // qtdeLivro;
    private final int isbnLivro;
    private int qtdeLivro;

    public EstoqueLivro(int isbnLivro, int qtdeLivro) {
        this.isbnLivro = isbnLivro;
        this.qtdeLivro = qtdeLivro;
    }

    protected void adicionaLivroAoEstoque(int qtdeLivro) {
        // this.qtdeLivro = this.qtdeLivro + qtdeLivro;
        this.qtdeLivro += qtdeLivro;
    }

    protected void retiraLivroDoEstoque(int qtdeLivro) {
        // this.qtdeLivro = this.qtdeLivro - qtdeLivro;
        this.qtdeLivro -= qtdeLivro;
    }

    protected int getQtdeLivro() {
        return this.qtdeLivro;
    }

    public String toString() {
        return isbnLivro + " " + qtdeLivro;
    }
}
