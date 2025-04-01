package main.java.bridge;

public abstract class Servico {
    protected Senioridade senioridade;

    protected float salarioBase;

    public Servico(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setSenioridade(Senioridade senioridade) {
        this.senioridade = senioridade;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
