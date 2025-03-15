package test.java.factorymethod;

import main.java.factorymethod.IService;
import main.java.factorymethod.ServiceFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IService servico = ServiceFactory.obterService("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IService service = ServiceFactory.obterService("Error");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Serviço inválido", e.getMessage());
        }
    }
}