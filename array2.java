package array;
import java.util.Scanner;
public class array2 {
	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3];
		
		Scanner in = new Scanner(System.in);
		
		for(int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
	            matriz[linha][coluna] = in.nextInt();
			}
		}
		int somap = matriz[0][0] + matriz[1][1] + matriz[2][2] ;
		int somas = matriz[0][2] + matriz[1][1] + matriz[2][0] ;
		System.out.println("Elementos da Diagonal Principal: " + matriz[0][0] + " " + matriz[1][1] + " " + matriz[2][2]);
		System.out.println("Elementos da Diagonal Secundária: " + matriz[0][2] + " " + matriz[1][1] + " " + matriz[2][0]);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somap);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somas);
		
	}
}
