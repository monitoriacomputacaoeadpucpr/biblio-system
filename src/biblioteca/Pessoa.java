package biblioteca;

public class Pessoa {

    // nome
    // cpf
    // vínculo (professor ou estudante)

    protected final String nome;
    protected final String cpf;
    protected final String vinculo;

    public Pessoa (String nome, String cpf, String vinculo) {
        this.nome = nome;
        this.cpf = cpf;
        this.vinculo = vinculo;
    }

    public String toString() {
        return this.nome + " " + this.cpf + " " + this.vinculo;
    }
}
