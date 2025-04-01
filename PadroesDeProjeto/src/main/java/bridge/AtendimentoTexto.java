package main.java.bridge;

public class AtendimentoTexto extends Servico{

    public AtendimentoTexto(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}