/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controleatleta.Atleta;
import controleatleta.Premiacao;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class Atirador extends Atleta{
    
    private ArrayList<Prova> provas;
    private ArrayList<Premiacao> premiacoes;
    private ArrayList<Sequencia> melhoresSequencias;
    private char posicao; //Destro(D), Canhoto(C)
    private char classe; //SH1(N),SH2(P)
    
    public Atirador(String nome) {
        super(nome);
    }

    public ArrayList<Prova> getProvas() {
        return provas;
    }

    public void setProvas(ArrayList<Prova> provas) {
        this.provas = provas;
    }

    public ArrayList<Premiacao> getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(ArrayList<Premiacao> premiacoes) {
        this.premiacoes = premiacoes;
    }

    public ArrayList<Sequencia> getMelhoresSequencias() {
        return melhoresSequencias;
    }

    public void setMelhoresSequencias(ArrayList<Sequencia> melhoresSequencias) {
        this.melhoresSequencias = melhoresSequencias;
    }

    public char getPosicao() {
        return posicao;
    }

    public void setPosicao(char posicao) {
        this.posicao = posicao;
    }

    public char getClasse() {
        return classe;
    }

    public void setClasse(char classe) {
        this.classe = classe;
    }
    
    
}
