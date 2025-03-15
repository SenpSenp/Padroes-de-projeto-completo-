package test.java.singleton;


import main.java.singleton.ConsumirServico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsumirServicoTest {

    @Test
    public void deveRetornarUrlServico() {
        ConsumirServico.getInstance().setUrlServico("https://github.com/marcoaparaujo");
        assertEquals("https://github.com/marcoaparaujo", ConsumirServico.getInstance().getUrlServico());
    }

    @Test
    public void deveRetornarApiKey() {
        ConsumirServico.getInstance().setApiKey("5C 5B 236B6B4A 4 5C 3C jc jC j2C jB 66B dl 22A 4AAA 66B 236B 623C 66 214BBD tk214CC 66 2B");
        assertEquals("5C 5B 236B6B4A 4 5C 3C jc jC j2C jB 66B dl 22A 4AAA 66B 236B 623C 66 214BBD tk214CC 66 2B", ConsumirServico.getInstance().getApiKey());
    }
}