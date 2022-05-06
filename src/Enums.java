public class Enums {
   public static void main(String[] args) {
        for (DiasSemana dia : DiasSemana.values()) {
            System.out.printf("O %s dia da semana é %s. O sistema: %s está atualizando!%n",
                    dia.ordinal()+1,
                    dia.name(),
                    dia.sistemaAtualizando
            );
        }
    }
}
