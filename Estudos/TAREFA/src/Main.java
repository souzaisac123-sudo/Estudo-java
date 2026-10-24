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

                    Tarefa t = new Tarefa(titulo, proximoId);
                    tarefas.add(t);
                    proximoId++;

                    System.out.println("Tarefa adicionada!");
                }

                case 2 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                    } else {
                        imprimirTarefas(tarefas);
                    }
                }

                case 3 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                        break;
                    }

                    imprimirTarefas(tarefas);
                    System.out.print("Digite o ID da tarefa: ");

                    try {
                        int idBusca = Integer.parseInt(sc.nextLine());
                        boolean achou = false;

                        for (Tarefa t : tarefas) {
                            if (t.getId() == idBusca) {
                                if (t.getConcluida()) {
                                    System.out.println("Essa tarefa já foi concluída.");
                                } else {
                                    t.concluir();
                                    System.out.println("Tarefa concluída!");
                                }

                                achou = true;
                                break;
                            }
                        }

                        if (!achou) {
                            System.out.println("ID não encontrado.");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Digite apenas números.");
                    }
                }

                case 4 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada.");
                        break;
                    }

                    imprimirTarefas(tarefas);
                    System.out.print("Digite o ID da tarefa que deseja remover: ");

                    try {
                        int idBusca = Integer.parseInt(sc.nextLine());

                        boolean removeu =
                                tarefas.removeIf(t -> t.getId() == idBusca);

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
