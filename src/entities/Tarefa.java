package entities;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean concluiuTarefa;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluiuTarefa = false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
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
