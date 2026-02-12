import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        List<Tarefa> tarefas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int opcao;

        do {


            System.out.println("Sistema de Lista to do");
            System.out.println("1 - cadastrar tarefa");
            System.out.println("2 - listar tarefas");
            System.out.println("3 - excluir uma tarefa");
            System.out.println("4 - marcar uma tarefa como concluida");
            System.out.println("0 - sair do programa");
            System.out.print("Digite a opção: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    scan.nextLine();
                    System.out.print("Digite o título da tarefa que deseja cadastrar: ");
                    String declaraTitulo = scan.nextLine();
                    System.out.print("Digite uma descrição para sua tarefa: ");
                    String declaraDescricao = scan.nextLine();
                    tarefas.add(new Tarefa(declaraTitulo, declaraDescricao));
                    System.out.println("Tarefa" + " " + declaraDescricao + " " + "foi adicionada a sua lista de tarefas.");
                    break;

                case 2:
                    if (tarefas.isEmpty()){
                        System.out.println("Lista de tarefas vazia, adicione tarefas para aumentar sua lista.");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            Tarefa tarefa = tarefas.get(i);
                            String status = tarefa.isConcluida() ? "Concluida" : "Não concluida";
                            System.out.println( i + " - " + tarefa.getTitulo() + ": " + tarefa.getDescricao() + " / " + status );
                        }
                    }
                    System.out.print("ENTER para avançar: ");
                    scan.nextLine();
                    scan.nextLine();
                    break;

                case 3:
                    System.out.print("Escreva o índice da tarefa que deseja remover: ");
                    int indiceRemove = scan.nextInt();

                    if (indiceRemove >= 0 && indiceRemove < tarefas.size()){
                        tarefas.remove(indiceRemove);
                        System.out.println("Tarefa removida");
                    } else {
                        System.out.println("índice inválido");
                    }
                    break;
                case 4:
                    System.out.println("Finalizou uma tarefa? Marque-a como concluída");
                    System.out.print("Digite o indice da tarefa que deseja marcar como concluida: ");
                    int indiceMarcar = scan.nextInt();

                    if (indiceMarcar >= 0 && indiceMarcar < tarefas.size()){
                        tarefas.get(indiceMarcar).setConcluida(true);
                        System.out.println("Tarefa marcada como concluida, parabéns!!");
                    } else {
                        System.out.println("Indice inválido");
                    }
                    break;

                case 0:
                    System.out.println("Obrigado por usar meu programa de lista TO DO, até breve!");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
}
