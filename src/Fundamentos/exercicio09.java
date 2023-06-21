package Fundamentos;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int resp = entrada.nextInt();
		 if (resp > 0 &&  resp!=0) {
			 System.out.println("O número " + resp + " é positivo");
		 }
		 else {
			 System.out.println("O número " + resp + " é negativo");
		 }

	}

}
