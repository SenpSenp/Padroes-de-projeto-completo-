package main.java.factorymethod;

public class ServicePlayers implements IService {

    public String executar() {
        return "Jogadores definidos";
    }

    public String cancelar() {
        return "Jogadores desdefinidos";
    }
}