package curso_programcao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02IfElseNota {
	
	 public void main(String[] args){
		 
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner(System.in);
		 
		 double nota1 = sc.nextDouble();
		 double nota2 = sc.nextDouble();
		 
		 double notaFinal = nota1 + nota2;
		 System.out.printf("NOTA FINAL = %.1f%n", notaFinal);
		 
		 if (notaFinal > 60.0) {
			 System.out.println("APROVADO!");
		 }
		 else {
			 System.out.println("REPROVADO!");
		 }
		 sc.close();
	}
}
