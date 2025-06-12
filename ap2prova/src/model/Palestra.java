package model;

public class Palestra extends Evento{

    private PalestranteConvidado palestranteConvidado;

    public Palestra(String titulo, String data, int duracao, String orcamento, Local local, PalestranteConvidado palestranteConvidado) {
        super(titulo, data, duracao, orcamento, local);
        this.palestranteConvidado = palestranteConvidado;
        palestranteConvidado.addPalestra(this);
    }

    public PalestranteConvidado getPalestranteConvidado() {
        return palestranteConvidado;
    }

    public void setPalestranteConvidado(PalestranteConvidado palestranteConvidado) {
        this.palestranteConvidado = palestranteConvidado;
    }
}