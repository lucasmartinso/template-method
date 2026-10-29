import static org.junit.jupiter.api.Assertions.*;
import org.example.MedicoResidente;
import org.junit.jupiter.api.Test;

public class MedicoResidenteTest {
    @Test
    void deveRetornarSalarioBase() {
        MedicoResidente medico = new MedicoResidente();

        assertEquals(12000.0f, medico.calcularSalarioBase(100));
    }

    @Test
    void deveRetornarTipo() {
        MedicoResidente medico = new MedicoResidente();

        assertEquals("Médico Especialista", medico.getTipo());
    }
}
