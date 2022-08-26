package biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class LivroMain {

    public static void main(String[] args) {
        // apresentar opções para o usuário
        // cadastrar livro
            // faz o cadastro e retorna para as opções
        // listar livro
            // lista os livros cadastrados e retorna para as opções
        // encerrar


        Scanner leitor = new Scanner(System.in);
        int opcaoEscolhida;
        Livro livro = null;
        ArrayList<Livro> livros = new ArrayList<Livro>();

        System.out.println("Olá! Seja bem vindo(a) à BiblioSystem!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Listar livros");
            System.out.println("9. Sair do sistema");
            System.out.println("\nO que deseja fazer?");
            System.out.print("Escolha uma das opções do menu acima: ");

            opcaoEscolhida = leitor.nextInt();

            switch(opcaoEscolhida) {
                case 1:
                    // cadastra
                    System.out.println("\nAdicionar livro");

                    System.out.print("Digite o título do livro: ");
                    String titulo = leitor.next();

                    System.out.print("Digite o ISBN do livro: ");
                    int isbn = leitor.nextInt();

                    System.out.print("Digite o nome do(a) autor(a): ");
                    String autor = leitor.next();

                    livro = new Livro(titulo, isbn, autor);
                    livros.add(livro);

                    System.out.println("br.edu.pucpr.bibliosystem.Livro cadastrado com sucesso!");
                    break;

                case 2:
                    // lista
                    System.out.println("\nListagem de livros");
                    System.out.println("--------------------------");

                    if (livros.size() > 0) {
                        livro.listarLivros(livros);
                    } else {
                        System.out.println("Nenhum livro cadastrado");
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
