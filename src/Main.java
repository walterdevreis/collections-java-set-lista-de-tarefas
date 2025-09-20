import entities.ListaTarefas;
import entities.Tarefa;

import java.util.Set;

import static java.lang.System.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java!");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        //Marcar uma tarefa como concluída de acordo com a descrição.
        listaTarefas.marcarTarefaConcluida("Estudar Java!");
        listaTarefas.marcarTarefaConcluida("Fazer exercícios físicos");
        listaTarefas.marcarTarefaConcluida("Organizar a mesa de trabalho");

        //Marca uma tarefa como pendente dde acordo com a descrição.
        listaTarefas.marcarTarefaPendente("Ler livro");
        listaTarefas.marcarTarefaPendente("Preparar apresentação");

        out.println();
        out.println("Exibe todas as tarefas da lista de tarefas: ");
        listaTarefas.exibirTarefas();

        out.println();
        out.println("Conta o número total de tarefas na lista de tarefas.");
        listaTarefas.contarTarefas();

        out.println();
        out.println("Exibe um SetList com as tarefas concluídas: ");
        Set<Tarefa> tarefasConcluidas = listaTarefas.obterTarefasConcluidas();
        for (Tarefa tarefa : tarefasConcluidas){
            out.println(tarefa);
        }

        out.println();
        out.println("Exibe um SetList com as tarefas pendentes: ");
        Set<Tarefa> tarefasPendentes = listaTarefas.obterTarefasPendentes();
        for (Tarefa tarefa : tarefasPendentes){
            out.println(tarefa);
        }

        out.println();
        out.println("Remove tarefa do Set de acordo com descrição.");
        listaTarefas.removerTarefa("Preparar apresentação");

        out.println();
        out.println("Exibe a lista de terefas:");
        listaTarefas.exibirTarefas();

        //Remove todas as tarefas da lista de tarefas.
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();
    }
}