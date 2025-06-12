// Minicurso.java (Modificado para um único Instrutor)
package model;

import java.util.HashSet;
import java.util.Set; // Ainda pode ser necessário para 'materias'

public class Minicurso extends Evento {

    private Instrutor instrutor; // Alterado para um único Instrutor
    private int cargaHoraria;
    private Set<String> materias; // Mantém-se como Set para materiais

    public Minicurso(String titulo, String data, int duracao, String orcamento, Local local, Instrutor instrutor, int cargaHoraria, Set<String> materias) {
        super(titulo, data, duracao, orcamento, local);
        this.instrutor = instrutor; // Atribui o único instrutor
        this.cargaHoraria = cargaHoraria;
        this.materias = materias;
    }

    // GET E SET
    public Instrutor getInstrutor() { // Getter para um único instrutor
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) { // Setter para um único instrutor
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