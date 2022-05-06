import java.util.Scanner;

/**
 *
 * Escreva uma nova versão do programa anterior que calcule
 * os valores da área e perímetro do cômodo,
 * solicitando ao usuário as medidas do cômodo uma de cada vez.
 *
 * Desta vez divida as responsabilidades do programa em 3 funções:
 * - capturarMedidas
 * - calcularArea
 * - calcularPerimetro
 *
 */
public class Aula04 {
    static double largura = 0;
    static double comprimento = 0;

    public static void main(String[] args) {
        capturarMedidas();

        System.out.printf("O cômodo tem %f x %f %n", comprimento, largura);
        double area = calcularArea(comprimento, largura);
        System.out.println("A área é: " + area + "m²");
        double perimetro = calcularPerimetro(largura, comprimento);
        System.out.println("O perímetro é: " + perimetro + " metros");
    }

    /*
        #Função:
        modificadorDeAcesso TipoDeRetorno nomeDaFunção (ListaDeParametrosOuArgumentos) {
            corpoDaFunção = código que será executado;
        }
        #ParametrosOuArgumentos:
        Tipo nome
     */
    private static void capturarMedidas() {
        Scanner scanner = new Scanner(System.in);
        //Solicita ao usuário o comprimento do cômodo
        System.out.println("Informe o comprimento do cômodo:");
        comprimento = scanner.nextDouble();
        //Solicita ao usuário a largura do cômodo
        System.out.println("Informe a largura do cômodo:");
        largura = scanner.nextDouble();
    }

    private static double calcularArea (double comprimento, double largura) {
        // multiplica o comprimento pela largura
        return comprimento * largura;
    }

    private static double calcularPerimetro (double largura, double comprimento) {
        // soma as medidas da largura e comprimento dos 4 lados do cômodo
//        return largura + comprimento + largura + comprimento;
        return (largura + comprimento) * 2;
    }
}