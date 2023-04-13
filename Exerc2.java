package JavaTech;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a sua 1a Nota: ");
		nota1 = leia.nextFloat();		
		System.out.println("\nEntre com a sua 2a Nota: ");
		nota2 = leia.nextFloat();
		System.out.println("Entre com a sua 3a Nota: ");
		nota3 = leia.nextFloat();		
		System.out.println("\nEntre com a sua 4a Nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA sua média é : %.1f",media);

	}

}
