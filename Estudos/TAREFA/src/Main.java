import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void imprimirTarefas(ArrayList<Tarefa> tarefas) {
        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<>();
        int proximoId = 1;

        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        GerenciadorDeTarefas gerenciador = new GerenciadorDeTarefas();

        do {
            System.out.println("\n--- GERENCIADOR DE TAREFAS ---");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Concluir");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números.");
                continue;
            }

            switch (opcao) {

                case 1 -> {
                    System.out.print("Digite o que fazer: ");
                    String titulo = sc.nextLine();

                    if (titulo.isBlank()) {
                        System.out.println("O título não pode ficar vazio.");
                        break;
                    }
                    gerenciador.adicionar(titulo);

                    System.out.println("Tarefa adicionada!");
                }

                case 2 -> {
                  gerenciador.listar();
                }

                case 3 -> {
                    if (gerenciador.estaVazio()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                        break;
                    }

                    gerenciador.listar();
                    System.out.print("Digite o ID da tarefa: ");

                    try {
                        int idBusca = Integer.parseInt(sc.nextLine());
                        boolean achou = gerenciador.concluir(idBusca);

                        if (achou) {
                            System.out.println("Tarefa concluída.");
                        }else {
                            System.out.println("ID não encontrado.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    }
                }

                case 4 -> {
                    if (gerenciador.estaVazio()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                        break;
                    }

                    imprimirTarefas(tarefas);
                    System.out.print("Digite o ID da tarefa que deseja remover: ");

                    try {
                        int idBusca = Integer.parseInt(sc.nextLine());
                        boolean removeu = gerenciador.remover(idBusca);

                        if (removeu) {
                            System.out.println("Tarefa removida!");
                        } else {
                            System.out.println("ID não encontrado.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    }
                }

                case 0 -> System.out.println("Saindo do programa...");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
