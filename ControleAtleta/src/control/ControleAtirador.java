package control;

import java.util.ArrayList;
import model.Atirador;
import model.Prova;

public class ControleAtirador {
    
    private ArrayList<Atirador> listaAtirador;

    public ControleAtirador() {
        this.listaAtirador = new ArrayList<Atirador>();
    }

    public void addAtirador(Atirador atirador){
        this.listaAtirador.add(atirador);
    }
    public void removeAtirador(Atirador atirador){
        this.listaAtirador.remove(atirador);
    }
    public Atirador getAtirador(String nome){
        for(Atirador a : listaAtirador){
            if(a.getNome().equalsIgnoreCase(nome)) return a;
        }
        return null;
    }
    public ArrayList<Atirador> listaAtirador(Prova prova){
        ArrayList<Atirador> atiradores = null;
        for(Atirador a : listaAtirador){
        if(a.getProvas().contains(prova)){
            atiradores.add(a);
        }
        }
        return atiradores;
    }
    public ArrayList<Atirador> listaAtirador(){
        return this.listaAtirador;
    }
    public ArrayList<Atirador> listaAtirador(String nome){
        ArrayList<Atirador> atiradores = null;
        for(Atirador a : listaAtirador){
            if(a.getNome().contains(nome)){
                atiradores.add(a);
            }
        }
        return atiradores;
    }
    
    
}
