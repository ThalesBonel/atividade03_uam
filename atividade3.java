/*Os dados são inseridos da lista até a pilha de forma (FIFO), após isso
são inseridos na fila tirando da pilha de forma " Last in, First Out" */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class atividade03_uam {

	public static void main(String[] args) {
		ArrayList<Integer> l ista = new ArrayList<>(5);
		Stack<In teger> pilha = new Stack<>();
		Queue<Integer> fila = new LinkedList<>();

    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);

    System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);

    while(!lista.isEmpty()) {
      int elemen to = lista.remove(0);
      pilha.push(elemento);
      System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\ n", lista, pilha, fila);
    }

    while(!pilha.isEmpty()) {
      int elemen to = p ilha.pop();
      fila.add(elemento);

      System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\ n", lista, pilha, fila);
    }

    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    lista.add(10);

    System.out.println("Inserindo v alor es [6, 7, 8, 9 e 10] na lista:");
    System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\n", lista, pilha, fila);

    while(!lista.isEmpty()) {
      int elemen to = lista.remove(0);
      pilha.push(elemento);

      System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\ n", lista, pilha, fila);
    }

    while(!pilha.isEmpty()) {
      int elemen to = p ilha.pop();
      fila.add(elemento);
      System.out.printf("Lista: %s\nPilha: %s\nFila: %s\n\ n", lista, pilha, fila);
    }

    System.out.println("Fila fin al: " + fila);
  }
}