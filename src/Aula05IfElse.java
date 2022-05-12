import java.util.Scanner;

public class Aula05IfElse {
    /*
    * Escreva um programa para verificar se uma pessoa pode votar ou não,
     de acordo com sua idade.
    O programa deve escrever na tela as seguintes informacões
    "Voto obrigatório"  - para eleitoras e eleitores, com idades entre 18 e 70 anos.
    "Voto  facultativo" - para maiores de 16 anos e menores de 18 anos;
     assim como maiores de 70 anos.
    "Sem direito a votar" - para o restante.
    Fonte: https://www.tre-sc.jus.br/eleicoes/tire-suas-duvidas/voto-obrigatoriedade

    * Exemplo

    Entrada - 15
    Saida - Voto Facultativo
    */
    public static void main(String[] args) {

        int idade = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe abaixo sua idade");
        idade = sc.nextInt();


        if (idade<=0){
            System.out.println("Idade inválida");
        } else{

            if (idade > 17 && idade<71){
                System.out.println("Voto obrigatório");
            }else if (idade>=16 && idade<18 || idade > 70) {
                System.out.println("Voto facultativo");
            }else {
                System.out.println("Sem direito a votar");
            }
        }

    }


}
