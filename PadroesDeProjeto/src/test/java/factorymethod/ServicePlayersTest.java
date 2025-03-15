package test.java.factorymethod;

import main.java.factorymethod.IService;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicePlayersTest {

    @Test
    void deveExecutarJogadores() {
        IService servico = ServiceFactory.obterService("Players");
        assertEquals("Jogadores definidos", servico.executar());
    }

    @Test
    void deveCancelarJogadores() {
        IService servico = ServiceFactory.obterService("Players");
        assertEquals("Jogadores desdefinidos", servico.cancelar());
    }

}