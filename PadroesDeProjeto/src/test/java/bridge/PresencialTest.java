package test.java.bridge;

import main.java.bridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PresencialTest {

    @Test
    void deveRetornarSalarioPresencialEstagiario() {
        Senioridade senioridade = new Estagiario();
        AtendimentoPresencial presencial = new AtendimentoPresencial(2000.0f);
        presencial.setSenioridade(senioridade);
        assertEquals(2000.0f, presencial.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioPresencialJunior() {
        Senioridade senioridade = new Junior();
        AtendimentoPresencial presencial = new AtendimentoPresencial(2000.0f);
        presencial.setSenioridade(senioridade);
        assertEquals(2200.0f, presencial.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioPresencialPleno() {
        Senioridade senioridade = new Pleno();
        AtendimentoPresencial presencial = new AtendimentoPresencial(2000.0f);
        presencial.setSenioridade(senioridade);
        assertEquals(3000.0f, presencial.calcularSalario(), 0.01f);
    }
    @Test
    void deveRetornarSalarioPresencialChefe() {
        Senioridade senioridade = new Chefe();
        AtendimentoPresencial presencial = new AtendimentoPresencial(2000.0f);
        presencial.setSenioridade(senioridade);
        assertEquals(5000.0f, presencial.calcularSalario(), 0.01f);
    }
    }