import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        int proximoId = 1;

        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        do {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("0 - sair");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números");

                continue;
            }


            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o título:");
                    String titulo = sc.nextLine();
                    Tarefa t = new Tarefa("", proximoId);
                    tarefas.add(t);
                    proximoId++;
                    System.out.println("Tarefa Adicionada! ");
                }

                case 2 -> {
                    System.out.println("Você escolheu Listar");
                }

                case 0 -> {
                    System.out.println("SAINDO");
                }
                default -> System.out.println("Opção inválida");
            }


        } while (opcao != 0);

        sc.close();
    }
}
