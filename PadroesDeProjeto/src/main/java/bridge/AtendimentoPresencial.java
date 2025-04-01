package main.java.bridge;
public class AtendimentoPresencial  extends Servico{


    public AtendimentoPresencial(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.senioridade.percentualAumento());
    }}

