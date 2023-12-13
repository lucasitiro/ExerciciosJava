package arraylist;
import java.util.Scanner;
import java.util.Stack;

public class pilha {
	
	public static Stack<String> pilha = new Stack<String>();
	
	public static void mostrarPilha(Stack<String> fila) {
		if (pilha.isEmpty()) {
			System.out.println("\nA Pilha está vazia!");
		} else {
			System.out.println("\nClientes na pilha:");
			for (String cliente : pilha) {
				System.out.println(cliente);
			}
		}
     }

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		boolean start = true;
		
		while(start) {
			
			System.out.println("***************************\n\n");
			System.out.println("1 - Adicionar Livro na pilha\n"
					+ "2 - Listar todos os Livros\n"
					+ "3 - Retirar Livro da pilha\n"
					+ "0 - Sair");
			System.out.println("\n\n***************************\n");
			System.out.println("Digite uma opção: ");
			
			int n = in.nextInt();
			in.nextLine();
			
			switch(n){
			
				case 1:
					System.out.println("\nDigite o nome: ");
					String nome = in.next();
					pilha.push(nome);
					mostrarPilha(pilha);
					System.out.println("\nLivro adicionado!");
					break;
		
				case 2:
					mostrarPilha(pilha);
					break;
					
				case 3:
					if (pilha.isEmpty()) {
						System.out.println("\nA Pilha está vazia!");
					} else {
						String livroR = pilha.pop();
						System.out.println("\nO Livro "+ livroR +" foi retirado da pilha!");
						mostrarPilha(pilha);
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
