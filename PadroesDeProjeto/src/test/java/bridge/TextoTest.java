package test.java.bridge;

import main.java.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextoTest {

    @Test
    void deveRetornarPagamentoTextoJunior() {
        Senioridade senioridade = new Junior();
        AtendimentoTexto atendimentoTexto = new AtendimentoTexto(1000.0f);
        atendimentoTexto.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoTexto.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPagamentoTextoEstagiario() {
        Senioridade senioridade = new Estagiario();
        AtendimentoTexto atendimentoTexto = new AtendimentoTexto(1000.0f);
        atendimentoTexto.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoTexto.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarPagamentoTextoPleno() {
        Senioridade senioridade = new Pleno();
        AtendimentoTexto atendimentoTexto = new AtendimentoTexto(1000.0f);
        atendimentoTexto.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoTexto.calcularSalario(), 0.01f);
    }    @Test
    void deveRetornarPagamentoTextoChefe() {
        Senioridade senioridade = new Chefe();
        AtendimentoTexto atendimentoTexto = new AtendimentoTexto(1000.0f);
        atendimentoTexto.setSenioridade(senioridade);
        assertEquals(1000.0f, atendimentoTexto.calcularSalario(), 0.01f);
    }


}
