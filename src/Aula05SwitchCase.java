import java.util.Scanner;

public class Aula05SwitchCase {

    //Escreva um programa que simule uma máquina de venda de bebidas
    //O usuário poderá escolher dentre 6 opções de bebidas abaixo:
    //1 - Coca-Cola
    //2 - Coca-Cola 0
    //3 - Pepsi
    //4 - Guaraná Antarctica
    //5 - Fanta Laranja
    //    Água

    // O programa devera imprimir na tela o nome do refrigerante selecionado
    public static void main(String[] args) {

        System.out.println("Informe a opcao desejada:");
        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Coca-Cola");
                break;
            case 2:
                System.out.println("Coca-Cola 0");
                break;
            case 3:
                System.out.println("Pepsi");
                break;
            case 4:
                System.out.println("Guaraná Antarctica");
                break;
            case 5:
                System.out.println("Fanta Laranja");
                break;
            default:
                System.out.println("Água");
        }

        System.out.println("Obrigado por escolher nossas maquinas");
    }
}
