package Revisao;

public class ciclista extends Atleta{
	public ciclista(String _nome, int _idade) {
		super(_nome, _idade);	 
	}
	boolean pedalando = false;
	
	public void pedalar() {
		
		if (aquecido == true) {
		if (pedalando == true) {
			System.out.println(this.nome + " Já está pedalando.");	
		}
		else {
			pedalando = true;
			System.out.println(this.nome + " Está pedalando");
		}}
	else {
		System.out.println(this.nome + " Precisa aquecer.");
	}}
	
	public void pararPedalar() {
		
		if (pedalando == false) {
			System.out.println(this.nome + " Não está pedalando.");	
		}
		else {
			pedalando = false;
			System.out.println(this.nome + " Parou de pedalar");
		}}}