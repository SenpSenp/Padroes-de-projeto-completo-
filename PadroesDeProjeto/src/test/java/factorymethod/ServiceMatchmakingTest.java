package test.java.factorymethod;

import main.java.factorymethod.IService;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceMatchmakingTest {

    @Test
    void deveExecutarMatchmaking() {
        IService servico = ServiceFactory.obterService("Matchmaking");
        assertEquals("Adversario encontrado", servico.executar());
    }

    @Test
    void deveCancelarMatchmaking() {
        IService servico = ServiceFactory.obterService("Matchmaking");
        assertEquals("Matchmaking cancelado", servico.cancelar());
    }

}