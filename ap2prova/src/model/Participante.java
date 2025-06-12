package model;

import java.util.HashSet;
import java.util.Set;

public class Participante {

    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private Set<Evento> eventos;

    //CONSTRUTOR
    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
        this.eventos = new HashSet<Evento>();
    }

    // GET E SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Set<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }


    // ADD E REMOVE
    public void addEvento(Evento evento){
        this.eventos.add(evento);
    }

    public void removeEvento(Evento evento){
        this.eventos.remove(evento);
    }
}
