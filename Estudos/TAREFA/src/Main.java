import java.util.List;
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
            System.out.println("3 - Concluir");
            System.out.println("4 - Remover");
            System.out.println("0 - sair");


            try {
                opcao = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite apenas números");

                continue;
            }


            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o o que fazer:");
                    String titulo = sc.nextLine();
                    Tarefa t = new Tarefa(titulo, proximoId);
                    tarefas.add(t);
                    proximoId++;
                    System.out.println("Tarefa Adicionada! ");
                }

                case 2 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada");
                    } else {
                        for (Tarefa t : tarefas) {
                            System.out.println(t.id + "-" + t.titulo + "-" + (t.concluida ? "Concluída" : "Pendente"));
                        }
                    }
                }

                case 3 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada");
                    } else {
                        for (Tarefa t : tarefas) {
                            System.out.println(t.id + "- " + t.titulo + " - " + (t.concluida ? "Concluído" : "Pendente"));

                        }
                        System.out.println("Digite o Id da tarefa");
                        try {
                            int idBusca = Integer.parseInt(sc.nextLine());
                            boolean achou = false;

                            for (Tarefa t : tarefas) {
                                if (t.id == idBusca) {
                                    t.concluida = true;
                                    achou = true;
                                }
                            }
                            if (achou) {
                                System.out.println("Tarefa concluída");
                            } else {
                                System.out.println("Id não encontrado.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Digite apenas números");
                        }
                    }
                }

                case 4 -> {
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada");
                    } else {
                        for (Tarefa t : tarefas) {
                            System.out.println(t.id + "- " + t.titulo + " - " + (t.concluida ? "Concluído" : "Pendente"));

                        }
                        System.out.println("Digite o Id da tarefa");
                        try {
                            int idBusca = Integer.parseInt(sc.nextLine());
                            boolean removeu = tarefas.removeIf(t -> t.id == idBusca);

                            if (removeu) {
                                System.out.println("Tarefa removida");
                            } else {
                                System.out.println("Id não encontrado.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Digite apenas números");
                        }
                    }
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
