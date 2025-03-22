package main.java.abstractfactory;

public class Aplicacao {

    private Configuracoes configuracoes;
    private Permicoes permicoes;

    public Aplicacao (FabricaAbstrata fabrica) {
        this.configuracoes = fabrica.createConfiguracoes();
        this.permicoes = fabrica.createPermicoes();
    }

    public String apresentarConfiguracoes() {
        return this.configuracoes.apresentar();
    }

    public String apresentarPermicoes() {
        return this.permicoes.apresentar();
    }
}
