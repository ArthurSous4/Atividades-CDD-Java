package FormasGeometricas;

public class losango extends figGeometricas {
	
	private double diagoMaior;
	private double diagoMenor;
	

public losango(double diagoMaior, double diagoMenor) {
    this.diagoMaior = diagoMaior;
    this.diagoMenor = diagoMenor;
	}
	
@Override
public void calcularArea() {
		System.out.println("A area do losango é " + (diagoMaior * diagoMenor)/2);
}
public void getDiagoMaior() {
	System.out.println("o valor da diagonal maior é: " + diagoMaior);
}
public void setDiagoMaior(double diagoMaior) {
	this.diagoMaior = diagoMaior;
}
public void getDiagoMenor() {
	System.out.println("o valor da diagonal menor é: " + diagoMenor);
}
public void setDiagoMenor(double diagoMenor) {
	this.diagoMenor = diagoMenor;
}}
