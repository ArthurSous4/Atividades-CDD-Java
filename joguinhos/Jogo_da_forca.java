package joguinhos;

import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Jogo_da_forca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random gerador = new Random();

        String PalavraSelecionada;
        ArrayList<String> PalavraDividida = new ArrayList<>();
        ArrayList<String> Placar = new ArrayList<>();
        String[] AnimaisSecretos = {"leao", "urso", "rato", "girafa", "tigre", "foca", "baleia", "jacare", "leopardo","axolote", "gato", "cachorro", "papagaio"};

        boolean jogarNovamente = true;

        while (jogarNovamente) {
            int indiceAleatorio = gerador.nextInt(AnimaisSecretos.length);
            PalavraSelecionada = AnimaisSecretos[indiceAleatorio];

            for (int i = 0; i < PalavraSelecionada.length(); i++) {
                char letra = PalavraSelecionada.charAt(i);
                String letraStr = String.valueOf(letra);
                PalavraDividida.add(letraStr);
                Placar.add("_ ");
            }

            int chances = 5;
            boolean perdeu = true;

            System.out.println("+*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+");
            System.out.println("                 JOGO DA FORCA                 ");
            System.out.println("+*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*++*+*+*+*+*+*+*+*+");
            System.out.println("A Palavra tem " + PalavraSelecionada.length() + " Letras");

            for (String letra : Placar) {
                System.out.print(letra);
            }
            System.out.println();

            while (perdeu) {
                if (chances == 0) {
                    System.out.println("Você Perdeu!!");
                    break;
                }

                System.out.println("Você tem " + chances + " chances!!");
                System.out.println("Digite uma letra ou digite 'chutar' para adivinhar a palavra: ");
                String chute = entrada.nextLine();

                if (chute.equals("chutar")) {
                    System.out.println("Digite a palavra completa: ");
                    String palavraChute = entrada.nextLine().toLowerCase().trim();

                    if (palavraChute.equals(PalavraSelecionada)) {
                        System.out.println("Parabéns! Você acertou a palavra!");
                        perdeu = false;
                    } else {
                        System.out.println("Você errou a palavra!");
                        chances--;
                    }
                } else if (chute.length() == 1) {
                    boolean acertou = false;

                    for (int k = 0; k < PalavraDividida.size(); k++) {
                        if (chute.equals(PalavraDividida.get(k))) {
                            acertou = true;
                            Placar.set(k, chute + " ");
                        }
                    }

                    if (acertou) {
                        System.out.println("Você acertou uma letra!");
                        for (String letra : Placar) {
                            System.out.print(letra);
                        }
                        System.out.println();
                    } else {
                        System.out.println("Você errou uma letra!");
                        chances--;
                        System.out.println("Você tem " + chances + " chances restantes.");
                    }
                } else {
                    System.out.println("Entrada inválida! Digite uma letra ou 'chutar' para adivinhar a palavra.");
                }
            }

            System.out.println("Deseja jogar novamente? Digite 'sim' para jogar novamente ou qualquer outra coisa para sair.");
            String jogarNovamenteInput = entrada.nextLine();
            jogarNovamente = jogarNovamenteInput.equalsIgnoreCase("sim");
        }

        System.out.println("Obrigado por jogar o Jogo da Forca! Até a próxima!");
    }
}
