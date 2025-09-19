import entities.Tarefa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Tarefa tarefa = new Tarefa("Lavar carro", true);

        System.out.println(tarefa);
    }
}