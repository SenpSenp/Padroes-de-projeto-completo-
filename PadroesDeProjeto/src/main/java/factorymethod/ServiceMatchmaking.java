package main.java.factorymethod;

public class ServiceMatchmaking implements IService {

    public String executar() {
        return "Adversario encontrado";
    }

    public String cancelar() {
        return "Matchmaking cancelado";
    }
}