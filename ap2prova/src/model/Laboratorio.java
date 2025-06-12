package model;

public class Laboratorio extends Local{

    private int numeroComputadores;
    private String tipoLab;

    public Laboratorio(String nome, int capacidadeMaxima, String blocoPredio, int numeroComputadores, String tipoLab) {
        super(nome, capacidadeMaxima, blocoPredio);
        this.numeroComputadores = numeroComputadores;
        this.tipoLab = tipoLab;
    }


    public int getNumeroComputadores() {
        return numeroComputadores;
    }

    public void setNumeroComputadores(int numeroComputadores) {
        this.numeroComputadores = numeroComputadores;
    }

    public String getTipoLab() {
        return tipoLab;
    }

    public void setTipoLab(String tipoLab) {
        this.tipoLab = tipoLab;
    }
}
