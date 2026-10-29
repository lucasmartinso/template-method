package org.example;

public abstract class Medico {
    private int CRM;
    private String nome;
    private String nomeInstituicao;

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public abstract float calcularSalarioBase(int horas);

    public String getTipo() {
        return "Medico";
    }
}
