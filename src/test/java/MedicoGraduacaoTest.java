import org.example.MedicoGraduacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoGraduacaoTest {
    @Test
    void deveRetornarSalarioBase() {
        MedicoGraduacao medico = new MedicoGraduacao();

        assertEquals(6000.0f, medico.calcularSalarioBase(100));
    }

    @Test
    void deveRetornarTipo() {
        MedicoGraduacao medico = new MedicoGraduacao();

        assertEquals("Médico Generalista", medico.getTipo());
    }
}
