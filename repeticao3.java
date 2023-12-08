package repeticao;
import java.util.Scanner;
public class repeticao3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int total = 0;
		int n = 1;
		do {
			System.out.println("Digite um número(Digite 0 para sair):");
			n = in.nextInt();
			if(n>0) {
				total += n;
			}
		} while(n!=0);
		System.out.println("A soma dos números positivos é: " + total);
	}
}
