package curso_programcao;

public class FuncoesInteressantesParaString {
	
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String s = "potato apple lemon";
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		/*
		 O proximo bloco sera de comandos em prints em tela!!
		 */
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("UpperCase: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");
		System.out.println("SubString(2): -" + s04 + "-");
		System.out.println("SubString(2, 9): -" + s05 + "-");
		System.out.println("Original: -" + original + "-");
		System.out.println("Replace(a,x): -" + s06 + "-");
		System.out.println("Replace(abc, xy): -" + s07 + "-");
		System.out.println("Index(bc): -" + i + "-");
		System.out.println("LastIndexOf(bc): -" + j + "-");
		System.out.println("vect: " + s);
		System.out.println("vect: " + word1);
		System.out.println("vect: " + word2);
		System.out.println("vect: " + word3); // testando o comentario
	}
}
