// Local.java (Modified)
package model;

public class Local {

    private String nome;
    private int capacidadeMaxima;
    private String blocoPredio;

    public Local(String nome, int capacidadeMaxima, String blocoPredio) {
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
        this.blocoPredio = blocoPredio;
    }

    // GETTERS ADDED
    public String getNome() {
        return nome;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public String getBlocoPredio() {
        return blocoPredio;
    }

    // SETTERS (optional, depending on whether these attributes can be changed after creation)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public void setBlocoPredio(String blocoPredio) {
        this.blocoPredio = blocoPredio;
    }
}