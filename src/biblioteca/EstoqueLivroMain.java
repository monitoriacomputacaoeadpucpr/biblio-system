package biblioteca;

import java.util.Scanner;

public class EstoqueLivroMain {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int opcaoEscolhida;
        EstoqueLivro estoqueLivro = null;
        int isbn;
        int qtdeLivro = 0;

        System.out.println("Olá! Seja bem vindo(a) à BiblioSystem!");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar livro ao estoque");
            System.out.println("2. Listar livros no estoque");
            System.out.println("3. Retirar livros do estoque");
            System.out.println("9. Sair do sistema");
            System.out.println("\nO que deseja fazer?");
            System.out.print("Escolha uma das opções do menu acima: ");

            opcaoEscolhida = leitor.nextInt();

            switch(opcaoEscolhida) {
                case 1:
                    // adiciona
                    System.out.println("\nAdicionar livro ao estoque");

                    System.out.print("Digite o ISBN: ");
                    isbn = leitor.nextInt();

                    estoqueLivro = new EstoqueLivro(isbn, qtdeLivro);

                    System.out.print("Digite a quantidade a ser adicionada: ");
                    qtdeLivro = leitor.nextInt();
                    estoqueLivro.adicionaLivroAoEstoque(qtdeLivro);
                    qtdeLivro = estoqueLivro.getQtdeLivro();

                    System.out.println("\nLivro adicionado com sucesso ao estoque!\n");
                    break;

                case 2:
                    // lista
                    System.out.println("\nListagem de livros");
                    System.out.println("--------------------------");

                    if (estoqueLivro != null) {
                        System.out.println(estoqueLivro);
                    } else {
                        System.out.println("Nenhum livro adicionado ao estoque.");
                    }

                    System.out.println("--------------------------\n");
                    break;

                case 3:
                    // retirar
                    System.out.println("\nRetirar livro do estoque");

                    System.out.print("Digite o ISBN: ");
                    isbn = leitor.nextInt();

                    estoqueLivro = new EstoqueLivro(isbn, qtdeLivro);

                    System.out.print("Digite a quantidade a ser retirada: ");
                    qtdeLivro = leitor.nextInt();
                    estoqueLivro.retiraLivroDoEstoque(qtdeLivro);
                    qtdeLivro = estoqueLivro.getQtdeLivro();

                    System.out.println("\nLivro retirado com sucesso do estoque!\n");
                    break;
            }

        } while(opcaoEscolhida != 9);

        // encerra
        System.out.println("\nObrigado por utilizar a BiblioSystem!\nPrograma encerrado");
        leitor.close();
        System.exit(0);
    }
}
