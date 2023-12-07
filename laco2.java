package exercicio_laco_condicional1;
import java.util.Scanner;
public class laco2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int a = in.nextInt();
		
		if (a%2==0 && a>0) {
			System.out.println("O Número " + a + " é par e positivo!");
		}
		if (a%2==0 && a<0) {
			System.out.println("O Número " + a + " é par e negativo!");
		}
		if (a%2!=0 && a>0) {
			System.out.println("O Número " + a + " é ímpar e positivo!");
		}
		if (a%2!=0 && a<0) {
			System.out.println("O Número " + a + " é ímpar e negativo!");
		}
		
	}

}
