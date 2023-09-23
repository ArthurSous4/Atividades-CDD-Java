package FormasGeometricas;

public class mainFormas {

	public static void main(String[] args) {
		triangulo tria1 = new triangulo(2.0,5.0);
		
		tria1.calcularArea();
		tria1.setAltura(10.0);
		tria1.calcularArea();
		
		System.out.println("-----------------------------------------");
		
		quadrado quadr1 = new quadrado(2.0);
		
		quadr1.calcularArea();
		quadr1.getLado();
		
		System.out.println("-----------------------------------------");
		
		losango los1 = new losango(2.0,50.0);
		
		los1.calcularArea();
		los1.setDiagoMaior(4.0);
		los1.calcularArea();
		
		System.out.println("-----------------------------------------");
		
		retangulo ret1 = new retangulo(10.0,3.0);
		
		ret1.calcularArea();
		ret1.setAltura(5.0);
		ret1.calcularArea();
		
		System.out.println("-----------------------------------------");
		
		trapezio trap1 = new trapezio(2.0,3.0,10.0);
		
		trap1.calcularArea();
		trap1.setAltura(20.0);
		trap1.calcularArea();
		
		System.out.println("-----------------------------------------");
		
		circulo circ1 = new circulo(5.0);
		
		circ1.calcularArea();
		circ1.setRaio(6.0);
		circ1.calcularArea();
	}

}
