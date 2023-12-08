package repeticao;
import java.util.Scanner;
public class repeticao1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo:");
		int a = in.nextInt();
		
		System.out.println("Digite o segundo número do intervalo:");
		int b = in.nextInt();
		
		if (a>=b) {
			System.out.println("Intervalo Inválido!");
			return;
		}
		for(int i = a; i<=b; i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i + " é múltiplo de 3 e 5");
			}
		}
		
	}

}
