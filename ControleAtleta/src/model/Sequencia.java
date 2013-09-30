package model;
public class Sequencia {
    
    private Prova prova;
    private String evento;
    private int pontos;

    public Sequencia() {
    }

    public Sequencia(String evento, int pontos) {
        this.evento = evento;
        this.pontos = pontos;
    }

    public Sequencia(Prova prova, String evento, int pontos) {
        this.prova = prova;
        this.evento = evento;
        this.pontos = pontos;
    }

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    
    
    
}
