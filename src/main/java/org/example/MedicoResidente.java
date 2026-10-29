package org.example;

public class MedicoResidente extends Medico {
    @Override
    public float calcularSalarioBase(int horas) {
        return 120 * horas;
    }

    @Override
    public String getTipo() {
        return "Médico Especialista";
    }
}
