package FormasGeometricas;

public class retangulo extends figGeometricas {
	
	private double base;
	private double altura;
	

public retangulo(double base, double altura) {
    this.base = base;
    this.altura = altura;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do retangulo é " + base * altura);		
}
public void getBase() {
	System.out.println("A base do retangulo é: " + base);
}
public void setBase(double base) {
	this.base = base;
}
public void getAltura() {
	System.out.println("A altura do retangulo é: " + altura);
}
public void setAltura(double altura) {
	this.altura = altura;
}}
