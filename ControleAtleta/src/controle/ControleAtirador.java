package controle;

import java.util.ArrayList;
import modelo.Atirador;
import modelo.Prova;

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
        return prova.getAtiradores();
    }
    public ArrayList<Atirador> listaAtirador(){
        return this.listaAtirador;
    }
    
    
}
