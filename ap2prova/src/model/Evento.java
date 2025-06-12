// Evento.java (Modified)
package model;

import java.util.HashSet;
import java.util.Set;

public abstract class Evento {

    private String titulo;
    private String data;
    private int duracao;
    private String orcamento;
    private Local local; // Changed to a single Local attribute
    private Set<Participante> participantes;


    public Evento(String titulo, String data, int duracao, String orcamento, Local local) { // Modified constructor
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.orcamento = orcamento;
        this.local = local;
        this.participantes = new HashSet<Participante>();
    }


    // GET E SET
    public Set<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(Set<Participante> participantes) {
        this.participantes = participantes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(String orcamento) {
        this.orcamento = orcamento;
    }

    public Local getLocal() { // New getter for generic Local
        return local;
    }

    public void setLocal(Local local) { // New setter for generic Local
        this.local = local;
    }

    // ADD E REMOVE

    public void addParticipante(Participante participante){
        this.participantes.add(participante);
    }

    public void removeParticipante(Participante participante){
        this.participantes.remove(participante);

    }
}