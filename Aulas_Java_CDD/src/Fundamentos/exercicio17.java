package Fundamentos;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		float[] Array1;
		Array1 = new float[5];
		
		for(int i = 0;i < 5;i++) {
			System.out.println("Digite a nota do aluno " + (i+1) + ": ");
			Array1[i] = entrada.nextFloat();}
		
		System.out.println("Média da turma: " + ((Array1[0]+Array1[1]+Array1[2]+Array1[3]+Array1[4])/5));

	}

}
