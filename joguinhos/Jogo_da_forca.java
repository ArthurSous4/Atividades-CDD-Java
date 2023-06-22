package joguinhos;

import java.util.Random;
import java.util.ArrayList;

public class Jogo_da_forca {

public static void main(String[] args) {
		
Random gerador = new Random();

String PalavraSelecionada;
ArrayList<String> PalavraDividida = new ArrayList<>();
ArrayList<String> Placar = new ArrayList<>();
String[] AnimaisSecretos = {"leao", "urso", "rato", "girafa", "tigre", "foca", "baleia", "jacare", "leopardo","axolote", "gato", "cachorro", "papagaio"};

int IndiceAleatorio = gerador.nextInt(AnimaisSecretos.length);
PalavraSelecionada = AnimaisSecretos[IndiceAleatorio];
System.out.println(PalavraSelecionada);

for (int i = 0; i < PalavraSelecionada.length(); i++) {
    char letra = PalavraSelecionada.charAt(i);
    String letraStr = String.valueOf(letra);
    PalavraDividida.add(letraStr);
}


		
		
		
		

	

}}

