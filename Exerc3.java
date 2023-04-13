package JavaTech;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		
		float salario, noturno, he, desc, saliquid;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Informe seu Salário: ");
		salario = leia.nextFloat();		
		System.out.println("Informe seu Salário Noturno: ");
		noturno = leia.nextFloat();
		System.out.println("Insira sua(s) Hora(s) Extra(s): ");
		he = leia.nextFloat();		
		System.out.println("Informe seu Desconto Mensal: ");
		desc = leia.nextFloat();
		
		saliquid = (salario+noturno+(he*5)-desc);
		
		System.out.printf("\nSeu Salário Liquido será de R$ %.2f",saliquid);
		
		
	}

}
