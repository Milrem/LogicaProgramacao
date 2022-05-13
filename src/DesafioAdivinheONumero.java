import java.util.Random;
import java.util.Scanner;

/**
 * O jogo Adivinhe o Número é um jogo simples em que um jogador escolhe um número qualquer e os outros devem tentar
 * adivinhar sabendo apenas o range, ou seja o menor e maior valor possível.
 *
 * Crie um programa em Java que implemente a lógica necessária para permitir ao usuário jogar o jogo Adivinhe o Número
 * com o computador sorteando o número secreto. O programa selecionará aleatoriamente um número inteiro entre 0 e 1000.
 * O programa deve pedir ao usuário que informe um número e informar ao usuário se o número secreto é maior ou menor que
 * o número informado e então pedir outro número, até que o usuário acerte o número secreto. Quando o usuário acertar o
 * número, o programa deve perguntar se o usuário deseja jogar novamente ou sair.
 *
 */
public class DesafioAdivinheONumero {
    public static void main(String[] args) {
        final int NUMERO_MAXIMO = 1000;
        final String OPCAO_CONTINUAR = "S";

        String opcao = OPCAO_CONTINUAR;
        do {
            int numeroSecreto = new Random().nextInt(NUMERO_MAXIMO);
            int numeroInformado = 0;
            do {
                System.out.println("Informe um número entre 0 e 1000:");
                numeroInformado = new Scanner(System.in).nextInt();
                if (numeroInformado < numeroSecreto) {
                    System.out.printf("O número secreto é maior que %d%n", numeroInformado);
                } else if (numeroInformado > numeroSecreto) {
                    System.out.printf("O número secreto é menor que %d%n", numeroInformado);
                }
            } while (numeroInformado != numeroSecreto);
            System.out.println("Você GANHOU!!!");
            System.out.println("Aperte S para jogar novamente");
            opcao = new Scanner(System.in).nextLine();
        } while (opcao.equalsIgnoreCase(OPCAO_CONTINUAR));
    }
}
