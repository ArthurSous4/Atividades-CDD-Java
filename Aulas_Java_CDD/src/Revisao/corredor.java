package Revisao;

public class corredor extends Atleta{
	public corredor(String _nome, int _idade) {
		super(_nome, _idade);	 
	}
	boolean correndo = false;
	
	public void correr() {
		
		if (aquecido == true) {
			if (correndo == true) {
				System.out.println(this.nome + " Já está pedalando.");	
			}
			else {
				correndo = true;
				System.out.println(this.nome + " Está pedalando");
			}}
		else {
			System.out.println(this.nome + " Precisa aquecer.");
		}}
	
	public void pararCorrer() {
		
		if (correndo == false) {
			System.out.println(this.nome + " Não está correndo.");	
		}
		else {
			correndo = false;
			System.out.println(this.nome + " Parou de correr");
		}}}
