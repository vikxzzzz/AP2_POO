package model;

public class Instrutor extends PessoaResponsavel{

    private String formcao;
    private String areaEspecialista;

    public Instrutor(String nome, String email, String formcao, String areaEspecialista) {
        super(nome, email);
        this.formcao = formcao;
        this.areaEspecialista = areaEspecialista;
    }


    //GET E SET

    public String getFormcao() {
        return formcao;
    }

    public void setFormcao(String formcao) {
        this.formcao = formcao;
    }

    public String getAreaEspecialista() {
        return areaEspecialista;
    }

    public void setAreaEspecialista(String areaEspecialista) {
        this.areaEspecialista = areaEspecialista;
    }
}
