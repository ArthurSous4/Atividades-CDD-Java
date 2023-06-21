package Fundamentos;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int resp = entrada.nextInt();
		
		System.out.println(resp > 0 && resp != 0 ? "é positivo" : "é negativo");

	}

}
