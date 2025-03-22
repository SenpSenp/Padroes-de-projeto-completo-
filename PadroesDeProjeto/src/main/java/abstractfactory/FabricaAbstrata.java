package main.java.abstractfactory;

public interface FabricaAbstrata {
    Configuracoes createConfiguracoes();
    Permicoes createPermicoes();
}