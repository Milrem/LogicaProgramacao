public enum DiasSemana {
    DOMINGO("Agenda"),
    SEGUNDA_FEIRA("ControlePonto"),
    TERCA_FEIRA("Senhas"),
    QUARTA_FEIRA(""),
    QUINTA_FEIRA(""),
    SEXTA_FEIRA(""),
    SABADO("");

    public String sistemaAtualizando;

    DiasSemana(String sistemaAtualizando) {
        this.sistemaAtualizando = sistemaAtualizando;
    }
}
