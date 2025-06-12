package model;

public class Seminario extends Evento {
    private String tema;
    private Participante alunoApresentador;
    private PessoaResponsavel orientador; // Can be an Instrutor or Organizador, or other responsible person.

    public Seminario(String titulo, String data, int duracao, String orcamento, Sala sala, String tema, Participante alunoApresentador, PessoaResponsavel orientador) {
        super(titulo, data, duracao, orcamento, sala);
        this.tema = tema;
        this.alunoApresentador = alunoApresentador;
        this.orientador = orientador;
    }

    public Seminario(String titulo, String data, int duracao, String orcamento, Auditorio auditorio, String tema, Participante alunoApresentador, PessoaResponsavel orientador) {
        super(titulo, data, duracao, orcamento, auditorio);
        this.tema = tema;
        this.alunoApresentador = alunoApresentador;
        this.orientador = orientador;
    }

    public Seminario(String titulo, String data, int duracao, String orcamento, Laboratorio laboratorio, String tema, Participante alunoApresentador, PessoaResponsavel orientador) {
        super(titulo, data, duracao, orcamento, laboratorio);
        this.tema = tema;
        this.alunoApresentador = alunoApresentador;
        this.orientador = orientador;
    }

    // GETTERS AND SETTERS
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Participante getAlunoApresentador() {
        return alunoApresentador;
    }

    public void setAlunoApresentador(Participante alunoApresentador) {
        this.alunoApresentador = alunoApresentador;
    }

    public PessoaResponsavel getOrientador() {
        return orientador;
    }

    public void setOrientador(PessoaResponsavel orientador) {
        this.orientador = orientador;
    }
}