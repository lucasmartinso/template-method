package org.example;

public class MedicoGraduacao extends Medico {
    @Override
    public float calcularSalarioBase(int horas) {
        return 60 * horas;
    }

    @Override
    public String getTipo() {
        return "Médico Generalista";
    }
}
