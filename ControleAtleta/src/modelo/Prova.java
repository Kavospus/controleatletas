package modelo;

import java.util.ArrayList;

public class Prova {
    private int distancia;
    private String arma;
    private String modo;
    private ArrayList<Atirador> atiradores;

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

    public ArrayList<Atirador> getAtiradores() {
        return atiradores;
    }

    public void setAtiradores(ArrayList<Atirador> atiradores) {
        this.atiradores = atiradores;
    }
   
    
    
    
}
