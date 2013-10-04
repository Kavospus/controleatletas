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
    
    public ArrayList<Prova> getProvas(String query){
        ArrayList<Prova> provas = new ArrayList<Prova>();
        
        for(Atirador a : listaAtirador){

            for(Prova p : a.getProvas()){
                if(p.toString().contains(query)){
                    if(!provas.contains(p)){
                        provas.add(p);
                        
                    }
                }
            }
            
        }
        
        
        return provas;
    }
    
    public ArrayList<Atirador> listaAtirador(ArrayList<Prova> provas){
        ArrayList<Atirador> atiradores = new ArrayList<Atirador>();
        for(Prova p : provas){
        for(Atirador a : listaAtirador){
        if(a.getProvas().contains(p)){
            atiradores.add(a);
        }
        }
        }
        return atiradores;
    }
    public ArrayList<Atirador> listaAtirador(){
        return this.listaAtirador;
    }
    public ArrayList<Atirador> listaAtirador(String nome){
        ArrayList<Atirador> atiradores = new ArrayList<Atirador>();
        for(Atirador a : listaAtirador){
            if(a.getNome().contains((CharSequence)nome)){
                atiradores.add(a);
            }
        }
        return atiradores;
    }
    
    
}
