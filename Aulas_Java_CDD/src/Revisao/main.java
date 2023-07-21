package Revisao;

public class main {

	public static void main(String[] args) {
		AnimalTeste pitu = new AnimalTeste ("pitu", "dalmata", 15.5);
		Animal Gato = new Animal ("gato", "sem pelo");
		
		Gato.comer();
		Gato.barulho();
		
		pitu.comer();
		pitu.barulho();

	}

}
