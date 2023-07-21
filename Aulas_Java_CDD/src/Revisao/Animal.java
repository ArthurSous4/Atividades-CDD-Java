package Revisao;

public class Animal {
	public String nome;
	public String pelagem;
	public Double peso;

public Animal (String _nome){
	this.nome = _nome;
}
public Animal (String _nome, String _pelagem) {
	this.nome = _nome;
	this.pelagem = _pelagem;
}
public Animal (String _nome, String _pelagem, Double _peso) {
	this.nome = _nome;
	this.pelagem = _pelagem;
	this.peso = _peso;
}

public void comer() {
	System.out.println(this.nome + " Está comendo.");
}
public void barulho() {
	System.out.println(this.nome + " Está fazendo barulho.");
}
}