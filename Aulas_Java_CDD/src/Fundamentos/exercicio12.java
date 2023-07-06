package Fundamentos;

public class exercicio12 {

	public static void main(String[] args) {
		int mult5total = 0;
		int mult3total = 0;
		int contador = 0;
		
		for (int i=0;i<20;i++) {
			contador = contador + 1;
			if (contador % 3 == 0)
				mult3total = mult3total + contador;
			
			if (contador % 5 == 0) 
				mult5total = mult5total + contador;}
			
			System.out.println(mult3total);
			System.out.println(mult5total);
			System.out.println(mult3total + mult5total);
		}
		

	}


