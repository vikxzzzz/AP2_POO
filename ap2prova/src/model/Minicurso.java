package model;

import java.util.*;

public class Minicurso extends Evento {

    private Instrutor instrutor;
    private int cargaHoraria;
    private Set<String> materias;

    public Minicurso(String titulo, String data, int duracao, String orcamento, Local local, Instrutor instrutor, int cargaHoraria, Set<String> materias) {
        super(titulo, data, duracao, orcamento, local);
        this.instrutor = instrutor;
        this.cargaHoraria = cargaHoraria;
        this.materias = materias;
    }

    // GET E SET
    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Set<String> getMaterias() {
        return materias;
    }

    public void setMaterias(Set<String> materias) {
        this.materias = materias;
    }
}