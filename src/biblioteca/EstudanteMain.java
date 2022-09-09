package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class EstudanteMain {

    public static void main(String[] args) {
        // apresentar opções para o usuário
        // cadastrar estudante
            // faz o cadastro e retorna para as opções
        // listar estudante
            // lista os estudantes cadastrados e retorna para as opções
        // encerrar


        Scanner leitor = new Scanner(System.in);
        int opcaoEscolhida;
        Estudante estudante = null;
        ArrayList<Estudante> estudantes = new ArrayList<Estudante>();

        System.out.println("Olá! Seja bem vindo(a) à BiblioSystem!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar estudante");
            System.out.println("2. Listar estudantes");
            System.out.println("9. Sair do sistema");
            System.out.println("\nO que deseja fazer?");
            System.out.print("Escolha uma das opções do menu acima: ");

            opcaoEscolhida = leitor.nextInt();

            switch(opcaoEscolhida) {
                case 1:
                    // cadastra
                    System.out.println("\nAdicionar estudante");

                    System.out.print("Digite o nome do(a) estudante: ");
                    String nome = leitor.next();

                    System.out.print("Digite o CPF do(a) estudante: ");
                    String cpf = leitor.next();

                    System.out.print("Digite o número da matrícula: ");
                    int matricula = leitor.nextInt();

                    System.out.print("Digite o nome do curso: ");
                    String curso = leitor.next();

                    estudante = new Estudante(nome, cpf, matricula, curso);
                    estudantes.add(estudante);

                    System.out.println("br.edu.pucpr.bibliosystem.Estudante cadastrado com sucesso!");
                    break;

                case 2:
                    // lista
                    System.out.println("\nListagem de estudantes");
                    System.out.println("--------------------------");

                    if (estudantes.size() > 0) {
                        estudante.listarEstudantes(estudantes);
                    } else {
                        System.out.println("Nenhum estudante cadastrado");
                    }

                    System.out.println("--------------------------\n");
                    break;
            }

        } while(opcaoEscolhida != 9);

        // encerra
        System.out.println("\nObrigado por utilizar a BiblioSystem!\nPrograma encerrado");
        leitor.close();
        System.exit(0);
    }
}
