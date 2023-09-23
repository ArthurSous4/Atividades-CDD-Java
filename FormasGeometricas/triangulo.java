package FormasGeometricas;

public class triangulo extends figGeometricas {
	
	private double base;
	private double altura;
	

public triangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do triangulo é " + (base * altura)/2);		
}
public void getBase() {
	System.out.println("A base do triangulo é: " + base);
}
public void setBase(double base) {
	this.base = base;
}
public void getAltura() {
	System.out.println("A altura do triangulo é: " + altura);
}
public void setAltura(double altura) {
	this.altura = altura;
}}


