package entities;

public class Tarefa {

    private String descricao;
    private boolean concluiuTarefa;

    public Tarefa(String descricao, boolean concluiuTarefa) {
        this.descricao = descricao;
        this.concluiuTarefa = concluiuTarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluiuTarefa() {
        return concluiuTarefa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluiuTarefa(boolean concluiuTarefa) {
        this.concluiuTarefa = concluiuTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluiuTarefa=" + concluiuTarefa +
                '}';
    }
}
