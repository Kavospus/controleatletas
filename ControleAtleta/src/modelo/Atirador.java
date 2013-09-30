/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controleatleta.Atleta;
import controleatleta.Premiacao;
import java.util.ArrayList;

/**
 *
 * @author Andre
 */
public class Atirador extends Atleta{
    
    ArrayList<Prova> provas;
    ArrayList<Premiacao> premiacoes;
    ArrayList<Sequencia> melhoresSequencias;
    
    public Atirador(String nome) {
        super(nome);
    }
    
    
}
