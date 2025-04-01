package main.java.bridge;

public class AtendimentoAnydesk extends Servico {


    public AtendimentoAnydesk(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase;
    }
}