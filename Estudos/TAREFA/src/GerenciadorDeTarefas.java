import java.util.ArrayList;

public class GerenciadorDeTarefas {
    private ArrayList<Tarefa> tarefas = new ArrayList<>();
    private int proximoId = 1;

    public void adicionar (String titulo) {
        Tarefa t = new Tarefa(titulo, proximoId);
        tarefas.add(t);
        proximoId++;
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa encontrada");
        }else {
            for (Tarefa t : tarefas) {
                System.out.println(t);
            }
        }
    }

    public boolean estaVazio() {
        return tarefas.isEmpty();
    }

    public boolean concluir(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.concluir();
                return true;
            }
        }
        return false;
    }

    public boolean remover(int id) {
        return tarefas.removeIf(t -> t.getId() == id);
    }
}
