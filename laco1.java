package exercicio_laco_condicional1;
import java.util.Scanner;
public class laco1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o número A:");
		int a = in.nextInt();
		
		System.out.println("Digite o número B:");
		int b = in.nextInt();
		
		System.out.println("Digite o número C:");
		int c = in.nextInt();
		
		if (a+b==c) {
			System.out.println("A Soma de A + B é Igual do que C");
		}
		if (a+b<c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}
		if (a+b>c) {
			System.out.println("A Soma de A + B é Maior do que C");
		}
	}

}
