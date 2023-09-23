package FormasGeometricas;

public class quadrado extends figGeometricas {
	
	private double lado;
	

public quadrado(double lado) {
    this.lado = lado;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do quadrado é " + lado * lado);		
}
public void getLado() {
	System.out.println("O lado do quadrado vale: " + lado);
}
public void setLado(double lado) {
	this.lado = lado;
}}
