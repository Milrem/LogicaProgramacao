public class Aula03 {
    public static void main(String[] args) {
        double comprimento = Double.valueOf(args[0]);
        double largura = Double.valueOf(args[1]);;
        double area = comprimento * largura;
        double perimetro = (2 * comprimento) + (2 * largura);

        System.out.printf("O cômodo tem %f x %f %n", comprimento, largura);
        System.out.println("A área é: " + area + "m²");
        System.out.println("O perímetro é: " + perimetro + " metros");
    }
}
