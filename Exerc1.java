package JavaTech;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {

		float salario, abono,salfinal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com o seu Salário atual: ");
		salario = leia.nextFloat();
		
		System.out.println("Entre com o Abono estipulado: ");
		abono = leia.nextFloat();
		
		salfinal = (salario+abono);
		
		System.out.printf("\nO seu Salário atualizado é de R$ %.2f",salfinal);
		
	}

}
