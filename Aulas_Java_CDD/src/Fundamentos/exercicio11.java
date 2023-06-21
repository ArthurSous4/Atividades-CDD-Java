package Fundamentos;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo número: ");
		int num2 = entrada.nextInt();
		System.out.println("Digite o terceiro número: ");
		int num3 = entrada.nextInt();
		
		int maior;
		int menor;
		
		
		if (num1 > num2 && num1 > num3){
			if (num2 > num3) {
				System.out.println("maior: " + num1 + " menor: " + num3);}
			else { 
				System.out.println("maior: " + num1 + " menor: " + num2);}			
			}
		
	if (num2 > num1 && num2 > num3){
			if (num1 > num3){
				System.out.println("maior: " + num2 + " menor: " + num3);}
			else{
				System.out.println("maior: " + num2 + " menor: " + num1);}
			}
	
	if (num3 > num1 && num3 > num2){
		if (num1 > num2){
			System.out.println("maior: " + num3 + " menor: " + num2);}
		else{
			System.out.println("maior: " + num3 + " menor: " + num1);}
		}
			
	}

}
