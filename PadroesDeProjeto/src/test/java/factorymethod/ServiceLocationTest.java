package test.java.factorymethod;

import main.java.factorymethod.IService;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceLocationTest {

    @Test
    void deveExecutarLocal() {
        IService servico = ServiceFactory.obterService("Location");
        assertEquals("Local adicionado com sucesso", servico.executar());
    }

    @Test
    void deveCancelarLocal() {
        IService servico = ServiceFactory.obterService("Location");
        assertEquals("Local removido", servico.cancelar());
    }

}