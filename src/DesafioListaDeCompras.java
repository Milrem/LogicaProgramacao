import java.util.Scanner;

public class DesafioListaDeCompras {


    //Crie um programa que simule uma lista(carrinho) de compras
    //O programa deve receber 10 produtos e seus respectivos preços
    //Ao receber todos os produtos, o programa deve imprimir todos os produtos e os preços informados
    //Bônus: Calcule o preço total dos produtos
    public static void main(String[] args) {


        int numeroDeProdutos = 10;
        String[] produtos = new String[numeroDeProdutos];
        double[] precos = new double[numeroDeProdutos];


        double total = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numeroDeProdutos; i++) {
            System.out.println("Informe o nome do produto " + (i + 1) );
            produtos[i] = scanner.nextLine();
            System.out.println("Informe o preço do produto " + (i + 1));
            precos[i] = scanner.nextDouble();
            scanner.nextLine(); //limpa o buffer do scanner   ;)

        }


        System.out.println("->Lista de compras");
        for (int i = 0; i < numeroDeProdutos; i++) {
            System.out.printf("Produto: %s - Preço: R$%.2f%n", produtos[i], precos[i]);
            total += precos[i];
        }

        System.out.printf("Preço total dos produtos  R$%.2f", total);



    }
}
