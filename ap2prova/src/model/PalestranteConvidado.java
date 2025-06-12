package model;

import java.util.HashSet;
import java.util.Set;

public class PalestranteConvidado {

    private String nome;
    private String email;
    private String instituicao;
    private Set<Palestra> palestras;


    public PalestranteConvidado(String nome, String email, String instituicao) {
        this.nome = nome;
        this.email = email;
        this.instituicao = instituicao;
        this.palestras = new HashSet<Palestra>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }


    // ADD E REMOVE

    public void addPalestra (Palestra palestra){
        this.palestras.add(palestra);
    }

    public void removePalestra (Palestra palestra){
        this.palestras.remove(palestra);
    }
}
