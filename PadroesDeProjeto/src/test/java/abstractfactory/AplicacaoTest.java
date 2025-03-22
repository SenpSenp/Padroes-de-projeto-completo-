package test.java.abstractfactory;

import main.java.abstractfactory.Aplicacao;
import main.java.abstractfactory.FabricaAbstrata;
import main.java.abstractfactory.FabricaIos;
import main.java.abstractfactory.FabricaWindows;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacaoTest {

    @Test
    void deveApresentarConfiguracoesIos() {
        FabricaAbstrata fabrica = new FabricaIos();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Configurações Ios", aplicacao.apresentarConfiguracoes());
    }

    @Test
    void deveApresentarConfiguracoesWindows() {
        FabricaAbstrata fabrica = new FabricaWindows();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Configurações Windows", aplicacao.apresentarConfiguracoes());
    }

    @Test
    void deveApresentarPermicoesIos() {
        FabricaAbstrata fabrica = new FabricaIos();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Permições Ios", aplicacao.apresentarPermicoes());
    }

    @Test
    void deveApresentarPermicoesWindows() {
        FabricaAbstrata fabrica = new FabricaWindows();
        Aplicacao aplicacao = new Aplicacao(fabrica);
        assertEquals("Permições Windows", aplicacao.apresentarPermicoes());
    }

}