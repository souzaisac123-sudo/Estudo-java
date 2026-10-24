public class Tarefa {
    int id;
    String titulo;
    boolean concluida;

    public Tarefa(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
        this.concluida = false;
    }
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    public boolean getConcluida() {
        return concluida;
    }
    public void concluir() {
        concluida = true;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " - " + (concluida ? "Concluída" : "Pendente");
    }
}