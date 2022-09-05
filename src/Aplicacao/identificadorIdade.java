package Aplicacao;

import java.util.Scanner;

public class identificadorIdade {

	public static void main(String[] args) {
		Scanner esc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = esc.nextInt();

		if (idade < 6) // bebe de 0 a 5
			System.out.println("Bebê");

		else if (idade < 12)                   //crianca de 6 a 11
			System.out.println("Criança");

		else if (idade < 18)                   //adolescente 12 a 17
			System.out.println("Adolescente");

		else if (idade < 30)                   //jovem 18 a 29
			System.out.println("Jovem");

		else if (idade < 60)                   //adulto de 30 a 59
			System.out.println("Adulto");

		else                  // idoso de 60 a ++
			System.out.println("Idoso (a)");
		
		esc.close();
	}

}

