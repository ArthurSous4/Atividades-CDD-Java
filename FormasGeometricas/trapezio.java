package FormasGeometricas;

public class trapezio extends figGeometricas {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	

public trapezio(double baseMaior, double baseMenor, double altura) {
    this.baseMaior = baseMaior;
    this.baseMenor = baseMenor;
    this.altura = altura;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do trapézio é " + (baseMaior + baseMenor) * altura/2);
}
public void getBaseMaior() {
	System.out.println("A base maior do trapézio é: " + baseMaior);
}
public void setBaseMaior(double baseMaior) {
	this.baseMaior = baseMaior;
}
public void getBaseMenor() {
	System.out.println("A base menor do trapézio é: " + baseMenor);
}
public void setBaseMenor(double baseMenor) {
	this.baseMenor = baseMenor;
}
public void getAltura() {
	System.out.println("A altura do trapézio é: " + altura);
}
public void setAltura(double altura) {
	this.altura = altura;
}}
