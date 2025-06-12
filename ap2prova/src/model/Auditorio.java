package model;

public class Auditorio extends Local {

    private boolean sistemaSom;
    private boolean estruturaTraducao;


    public Auditorio(String nome, int capacidadeMaxima, String blocoPredio, boolean sistemaSom, boolean estruturaTraducao) {
        super(nome, capacidadeMaxima, blocoPredio);
        this.sistemaSom = sistemaSom;
        this.estruturaTraducao = estruturaTraducao;
    }


    public boolean isSistemaSom() {
        return sistemaSom;
    }

    public void setSistemaSom(boolean sistemaSom) {
        this.sistemaSom = sistemaSom;
    }

    public boolean isEstruturaTraducao() {
        return estruturaTraducao;
    }

    public void setEstruturaTraducao(boolean estruturaTraducao) {
        this.estruturaTraducao = estruturaTraducao;
    }
}
