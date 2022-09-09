package biblioteca;

import java.util.ArrayList;

public class Estudante extends Pessoa {
    // nome
    // cpf
    // matricula
    // curso
    // vinculo

    private final int matricula;
    private final String curso;
    private final static String vinculo = "aluno";

    public Estudante (String nome, String cpf, int matricula, String curso) {
        super(nome, cpf, vinculo);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String toString() {
        return this.nome + " " + this.cpf + " " + vinculo + " " + this.matricula + " " + this.curso;
    }

    protected void listarEstudantes(ArrayList<Estudante> estudantes) {
        for (int i = 0; i < estudantes.size() ; i++) {
            System.out.println(estudantes.get(i));
        }
    }
}
