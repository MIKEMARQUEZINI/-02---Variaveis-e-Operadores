package JavaTech;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		
		
		String nome = "Charles";
		int idade = 25, x=10;
		double altura = 1.72;
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Nome Participante: "+nome);
		System.out.println("Idade do Participante: "+idade+" anos");
		System.out.println("Altura do Participante: "+altura);
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		//System.out.println("\nA média Aritmetica: "+media);
		System.out.printf("\nA média Aritmetica: %.2f",+media);
		
		/* raiz quadrada
		 * 
		 */
		nota1 = (float) Math.sqrt(nota2);
		
		/* expoente
		 * 
		 */
		nota2 = (float) Math.pow(nota3, 3);
		
		x = x % 2;
		
		//System.out.printf("\n A Raiz quadrada da Primeira Nota : %.2f", +nota1);
		
	}

}
