package exercicio_laco_condicional1;
import java.util.Scanner;
public class laco_switch1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o código do produto");
		int n = in.nextInt();
		System.out.println("Digite a quantidade do produto");
		int q = in.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("Cachorro quente");
			System.out.println(10*q);
			break;
		case 2:
			System.out.println("X-Salada");
			System.out.println(15*q);
			break;
		case 3:
			System.out.println("X-Bacon");
			System.out.println(18*q);
			break;
		case 4:
			System.out.println("Bauru");
			System.out.println(12*q);
			break;
		case 5:
			System.out.println("Refrigerente");
			System.out.println(8*q);
			break;
		case 6:
			System.out.println("Suco de laranja");
			System.out.println(13*q);
			break;
		}
		
	}

}
