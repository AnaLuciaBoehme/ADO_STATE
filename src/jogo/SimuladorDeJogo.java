package jogo;

import modelo.Personagem;
import java.util.Scanner;

public class SimuladorDeJogo {
    public static void main(String[] args) {
        Personagem personagem = new Personagem();
        Scanner scanner = new Scanner(System.in);

        while (personagem.estaVivo()) {
            System.out.println("\nEscolha uma ação:");
            System.out.println("1 - Esperar");
            System.out.println("2 - Correr");
            System.out.println("3 - Pular");
            System.out.println("4 - Morte");
            System.out.println("5 - Sair");
            System.out.print("Digite sua escolha: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    personagem.esperar();
                    break;
                case 2:
                    personagem.correr();
                    break;
                case 3:
                    personagem.pular();
                    break;
                case 4:
                    personagem.morrer();
                    break;
                case 5:
                    System.out.println("Saindo do jogo...");
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }

            personagem.verificarMorte();
        }

        System.out.println("O personagem morreu. Fim de jogo!");
        scanner.close();
    }
}
