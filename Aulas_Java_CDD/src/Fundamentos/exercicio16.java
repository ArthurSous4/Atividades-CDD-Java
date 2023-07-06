package Fundamentos;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] Array1;
		Array1 = new int[10];
		int[] Array2;
		Array2 = new int[11];
		int[] Array3;
		Array3 = new int[10];
		int[] Array4;
		Array4 = new int[10];
		
for(int i = 0; i < Array1.length;i++) {
	System.out.println("Digite os números da primeira Array");
	Array1[i] = entrada.nextInt();}
		
for(int n : Array1)		
System.out.print(n + " ");
		

	}

}
