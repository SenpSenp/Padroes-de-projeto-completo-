package main.java.factorymethod;

public class ServiceLocation implements IService {

    public String executar() {
        return "Local adicionado com sucesso";
    }

    public String cancelar() {
        return "Local removido";
    }
}