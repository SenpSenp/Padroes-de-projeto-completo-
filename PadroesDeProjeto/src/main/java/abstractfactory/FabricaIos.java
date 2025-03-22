package main.java.abstractfactory;

public class FabricaIos implements FabricaAbstrata {

    @Override
    public Configuracoes createConfiguracoes() {
        return new ConfiguracoesIos();
    }

    @Override
    public Permicoes createPermicoes() {
        return new PermicoesIos();
    }
}
