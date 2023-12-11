package array;
import java.util.Scanner;
import java.util.Arrays;
public class array1 {

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		Scanner in = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o número do vetor:");
			vetor[i] = in.nextInt();
		}
		
		Arrays.sort(vetor);
		
		System.out.println("Digite o número que você deseja encontrar:");
		int n = in.nextInt();
		int posicao = Arrays.binarySearch(vetor, n);
		if(posicao>=0) {
			System.out.println("O número " + n + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + n + "não foi encontrado!");
		}
	}

}
