package Revisao;

public class Atleta {
	public String nome;
	public int idade;
	public boolean aquecido;

	public Atleta(String _nome, int _idade) {
		this.nome = _nome;
		this.idade = _idade;
	}
	public void aquecer() {
		if (this.aquecido == true ) {
			System.out.println(this.nome + " Ja está aquecido");}
		
		else {
		this.aquecido = true;
		System.out.println(this.nome + " Está aquecido.");}
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnome() {
		return nome;
	}


}





