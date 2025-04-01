package test.java.bridge;

import main.java.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnydeskTest {

    @Test
    void deveRetornarPagamentoAnydeskJunior() {
        Senioridade senioridade = new Junior();
        AtendimentoAnydesk atendimentoAnydesk = new AtendimentoAnydesk(1000.0f);
        atendimentoAnydesk.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoAnydesk.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPagamentoAnydeskEstagiario() {
        Senioridade senioridade = new Estagiario();
        AtendimentoAnydesk atendimentoAnydesk = new AtendimentoAnydesk(1000.0f);
        atendimentoAnydesk.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoAnydesk.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPagamentoAnydeskPleno() {
        Senioridade senioridade = new Pleno();
        AtendimentoAnydesk atendimentoAnydesk = new AtendimentoAnydesk(1000.0f);
        atendimentoAnydesk.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoAnydesk.calcularSalario(), 0.01f);
    }    @Test
    void deveRetornarPagamentoAnydeskChefe() {
        Senioridade senioridade = new Chefe();
        AtendimentoAnydesk atendimentoAnydesk = new AtendimentoAnydesk(1000.0f);
        atendimentoAnydesk.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoAnydesk.calcularSalario(), 0.01f);
    }

}
