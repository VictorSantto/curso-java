package curso_programcao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]  args) {
		
		String nome = "Maria";
		Integer idade = 31;
		Double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		
		Integer y;
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		

		Double a;
		Locale.setDefault(Locale.US);
		a = sc.nextDouble();
		System.out.println("Voce digitou: " + a);
		
		char e;
		e = sc.next().charAt(0);
		System.out.print("Voce digitou:" + e);
		
		sc.close();
	}
	
	

}
