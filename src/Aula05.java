import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Imprimir toda a tabuada desse número (1 x 1 = 1, 1 x 2 = 2, ..., 1 x 9 = 9.
        int numero = 0;
        do {
            System.out.println("Informe um número para ver a tabuada correspondente:");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println();
                break;
            }

            for (int i = 1; i <= 10; i = i + 1) {
                System.out.printf("%d x %d = %d %n", numero, i, numero * i);
            }
        } while (true);
    }
}
