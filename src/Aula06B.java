import java.util.Scanner;

public class Aula06B {
    /*
    Escreva um programa em Java que solicite ao usuário um valor numérico entre 1 e 10.
    Crie um array com essa capacidade e solicite ao usuário um novo valor para armazenar em cada posição do array.
    Quando todas as posições estiverem preenchidas, exiba todos os valores na ordem inversa em que foram informados.
     */
    public static void main(String[] args) {
        int[] numeros = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um número");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Números inversos");
        for (int i = numeros.length -1; i >= 0; i--) {
            System.out.printf(" %d ," , numeros[i]);
        }
    }
}
