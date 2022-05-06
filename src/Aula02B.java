public class Aula02B {
    public static void main(String[] args) {
        double comprimento = 3.75;
        double largura = 4.45;
        double area = comprimento * largura;
        double perimetro = (2 * comprimento) + (2 * largura);

        double perimetro2 = (comprimento + largura) * 2;

        System.out.println("A área é: " + area + "m²");
        System.out.println("O perímetro é: " + perimetro + " metros");
        System.out.printf("O perímetro é: %.9f metro -> %s %s",
                25f, perimetro2,    "teste");
    }
}
