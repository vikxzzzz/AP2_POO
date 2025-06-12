package model;

import java.util.HashSet;
import java.util.Set;

public class Organizador extends PessoaResponsavel{

    private String funcAdministrativa;
    private Set<Evento> eventos;

    //CONSTRUTOR
    public Organizador(String nome, String email, String funcAdministrativa) {
        super(nome, email);
        this.funcAdministrativa = funcAdministrativa;
        this.eventos = new HashSet<Evento>();
    }


    //GET E SET
    public String getFuncAdministrativa() {
        return funcAdministrativa;
    }

    public void setFuncAdministrativa(String funcAdministrativa) {
        this.funcAdministrativa = funcAdministrativa;
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
