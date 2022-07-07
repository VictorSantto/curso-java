package curso_programcao;

import java.util.Scanner;

public class ExercicioEstrturaSequencial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer A, B, soma;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		soma = A + B;
	
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
