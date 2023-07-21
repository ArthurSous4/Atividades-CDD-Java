package Revisao;

public class AnimalTeste extends Animal {
	
		public AnimalTeste(String _nome, String _pelagem, Double _peso) {
			super (_nome, _pelagem, _peso);
		}
		
		public void comer() {
			System.out.println(nome + " está comendo muito");
		}
		
		public void barulho() {
			System.out.println(this.nome + " Está latindo.");
	}}

