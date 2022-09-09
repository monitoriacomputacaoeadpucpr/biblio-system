package biblioteca;

import java.util.ArrayList;

public class Professor extends Pessoa {

    // nome
    // cpf
    // registro
    // vinculo

    private final String registro;
    private final static String vinculo = "professor";

    public Professor(String nome, String cpf, String registro) {
        super(nome, cpf, vinculo);
        this.registro = registro;
    }

    public String toString() {
        return this.nome + " " + this.cpf + " " + vinculo + " " + this.registro;
    }

    protected void listarProfessores(ArrayList<Professor> professores) {
        for (int i = 0; i < professores.size() ; i++) {
            System.out.println(professores.get(i));
        }
    }
}
