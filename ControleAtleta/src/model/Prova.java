package model;


public class Prova {
    private int distancia;
    private String arma;
    private String modo;

    public Prova() {
    }

    public Prova(int distancia, String arma, String modo) {
        this.distancia = distancia;
        this.arma = arma;
        this.modo = modo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }


    @Override
    public String toString() {
        return  distancia + "m " + arma + " " + modo;
    }
   
    
    
    
}
