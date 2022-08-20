public class Estudante {
    // nome
    // matricula
    // curso

    private final String nome;
    private final int matricula;
    private final String curso;

    public Estudante (String nome, int matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return this.nome + " " + this.matricula + " " + this.curso;
    }
}
