package Fundamentos;

public class exercicio18 {

	public static void main(String[] args) {
		String str = "hello;";
		String Resultado = str.replace("l","r");
		
		System.out.println(Resultado);
		
		String palavra = "hello World";
		String resultado = palavra.substring (3,8);
		 
		System.out.println(resultado);
		
		String stri = "    hello ";
		String Resul = stri.trim ();
		
		System.out.println(Resul);
		
		String ty = "Hello";
		char c = ty.charAt(1);
		
		System.out.println(c);
		
		String s1 = "Hello";
		String s2 = "HELLO";
		boolean b1 = s1.equals("Hello"); 
		boolean b2 = s1.equals (s2); //false
		boolean b3 = s1.equalsIgnoreCase(s2); //true
		boolean b4 = s1.equalsIgnoreCase ("azul"); //false
		
		

	}

}
