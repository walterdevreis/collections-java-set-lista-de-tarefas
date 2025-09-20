package entities;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descrisao){
        this.listaTarefas.add(new Tarefa(descrisao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!listaTarefas.isEmpty()) {
            for (Tarefa t : listaTarefas) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaTarefas.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas(){
        if (!listaTarefas.isEmpty()){
            for (Tarefa tarefas : listaTarefas){
                System.out.println(tarefas);
            }
        }
        else {
            System.out.println("Tarefas não encontradas!");
        }
    }

    public void contarTarefas(){
        System.out.println("Número total de tarefas: " + listaTarefas.size());
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : listaTarefas){
            if (tarefa.isConcluiuTarefa() == true){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : listaTarefas){
            if (tarefa.isConcluiuTarefa() == false){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefas : listaTarefas){
            if (tarefas.getDescricao().equalsIgnoreCase(descricao)){
                tarefas.setConcluiuTarefa(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : listaTarefas){
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setConcluiuTarefa(false);
            }
        }
    }

    public void limparListaTarefas(){
        if (listaTarefas.isEmpty()){
            System.out.println("A lista de tarefas está vazia!");
        }
        else {
            listaTarefas.clear();
        }
    }
}
