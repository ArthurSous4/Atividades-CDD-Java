package Revisao;

public class nadador extends Atleta{
	public nadador(String _nome, int _idade) {
		super(_nome, _idade);	 
	}
	boolean nadando = false;
	
	public void nadar() {
		
		if (aquecido == true) {
			if (nadando == true) {
				System.out.println(this.nome + " Já está nadando.");	
			}
			else {
				nadando = true;
				System.out.println(this.nome + " Está nadando");
			}}
		else {
			System.out.println(this.nome + " Precisa aquecer.");
		}}
	
	public void pararNadar() {
		
		if (nadando == false) {
			System.out.println(this.nome + " Não está nadando.");	
		}
		else {
			nadando = false;
			System.out.println(this.nome + " Parou de nadar");
		}}}