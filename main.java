package JavaTech;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		
		float num1, num2, num3, num4, x;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com a seu 1o Número: ");
		num1 = leia.nextFloat();		
		System.out.println("Entre com a seu 2o Número: ");
		num2 = leia.nextFloat();
		System.out.println("Entre com a seu 3o Número: ");
		num3 = leia.nextFloat();		
		System.out.println("Entre com a seu 4o Número: ");
		num4 = leia.nextFloat();
		
		x = (num1*num2) - (num3*num4);
		
		System.out.printf("\nA diferença entre os números digitados é de %.1f",x);

	}

}
