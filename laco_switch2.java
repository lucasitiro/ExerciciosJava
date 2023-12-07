package exercicio_laco_condicional1;
import java.util.Scanner;
public class laco_switch2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		float a = in.nextFloat();
		System.out.println("Digite o segundo número:");
		float b = in.nextFloat();
		System.out.println("Digite a operação: 1 soma, 2 subtração, 3 divisão, 4 multiplicação");
		int opcao = in.nextInt();
		switch (opcao) {
		case 1:
			System.out.println(a+b);
		case 2:
			System.out.println(a-b);
		case 3:
			System.out.println(a/b);
		case 4:
			System.out.println(a*b);
		}
	}
}
