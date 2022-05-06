import java.util.Locale;
import java.util.Scanner;

public class Aula03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia da semana:");
        String nomeDia = scanner.nextLine();
        DiasSemana dia = DiasSemana.valueOf(nomeDia.toUpperCase(Locale.ROOT));

        System.out.println("Informe o nome do cômodo:");
        String nome = scanner.nextLine();

        System.out.println("Informe o comprimento do cômodo:");
        double comprimento = scanner.nextDouble();

        System.out.println("Informe a largura do cômodo:");
        double largura = scanner.nextDouble();

        double area = comprimento * largura;
        double perimetro = (2 * comprimento) + (2 * largura);

        System.out.println("Hoje é " + dia.name());
        System.out.printf("O cômodo %s tem %f x %f %n", nome, comprimento, largura);
        System.out.println("A área é: " + area + "m²");
        System.out.println("O perímetro é: " + perimetro + " metros");
    }
}
