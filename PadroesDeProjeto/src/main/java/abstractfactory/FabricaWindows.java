package main.java.abstractfactory;

public class FabricaWindows implements FabricaAbstrata {

    @Override
    public Configuracoes createConfiguracoes() {
        return new ConfiguracoesWindows();
    }

    @Override
    public Permicoes createPermicoes() {
        return new PermicoesWindows();
    }
}