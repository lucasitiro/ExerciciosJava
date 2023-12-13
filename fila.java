package arraylist;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {
	
	public static Queue<String> fila = new LinkedList<String>();
	
	public static void mostrarFila(Queue<String> fila) {
		if (fila.isEmpty()) {
			System.out.println("\nA Fila está vazia!");
		} else {
			System.out.println("\nClientes na fila:");
			for (String cliente : fila) {
				System.out.println(cliente);
			}
		}
     }

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		boolean start = true;
		
		while(start) {
			
			System.out.println("***************************\n\n");
			System.out.println("1 - Adicionar Cliente na fila\n"
					+ "2 - Listar todos os clientes\n"
					+ "3 - Retirar Cliente da Fila\n"
					+ "0 - Sair");
			System.out.println("\n\n***************************\n");
			System.out.println("Digite uma opção: ");
			
			int n = in.nextInt();
			in.nextLine();
			
			switch(n){
			
				case 1:
					System.out.println("\nDigite o nome: ");
					String nome = in.next();
					fila.add(nome);
					mostrarFila(fila);
					System.out.println("\nCliente adicionado");
					break;
		
				case 2:
					mostrarFila(fila);
					break;
					
				case 3:
					if (fila.isEmpty()) {
						System.out.println("\nA Fila está vazia!");
					} else {
						String clienteR = fila.poll();
						System.out.println("\nO cliente " + clienteR + " foi chamado!");
						mostrarFila(fila);
					}
					break;
					
				case 0:
					System.out.println("\nPrograma finalizado!");
					start = false;
					break;
					
			    default:
			    	System.out.println("\nOpção inválida! Tente novamente.");
					break;
			}
		}
		
		in.close();
		
		}	
}


