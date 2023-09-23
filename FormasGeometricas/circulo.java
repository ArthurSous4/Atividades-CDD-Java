package FormasGeometricas;

public class circulo extends figGeometricas {
	
	private double raio;
	private double pi = 3.14;
	

public circulo(double raio) {
    this.raio = raio;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do circulo é " + pi * raio * raio);		
}
public void getRaio() {
	System.out.println("O raio do círculo vale: " + raio);
}
public void setRaio(double raio) {
	this.raio = raio;
}}
