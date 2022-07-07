package curso_programcao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSoma01 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double aera = largura * comprimento;
		double preco = aera * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", aera);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}
}
