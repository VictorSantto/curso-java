package curso_programcao;

import java.util.Scanner;

public class Exercicio01IfElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N < 0) {
			System.out.println("NEGATIVO!");
		}
		else {
			System.out.println("NÃO NEGATIVO!");
		}
		
		sc.close();
	}

}
