package repeticao;
import java.util.Scanner;
public class repeticao2 {

	public static void main(String[] args) {
		int n = 1;
		int n21 = 0;
		int n50 = 0;
		while(n>0) {
			System.out.println("Digite uma idade:");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			if (n<21) {
				n21++;
			}
			if (n>50) {
				n50++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + n21);
		System.out.println("Total de pessoas maiores de 50 anos: " + n50);
	}

}
