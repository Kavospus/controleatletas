/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import java.util.ArrayList;
import control.ControleAtirador;
import model.Atirador;
import model.Prova;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrebsguedes
 */
public class ControleAtiradorTest {
    
    public ControleAtiradorTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    ControleAtirador controle;
    Atirador atirador;
    Atirador outroAtirador;
    Prova prova;
    
    @Before
    public void setUp() {
        controle  = new ControleAtirador();
        atirador = new Atirador("Teste");
        prova = new Prova(30,"Air Soft","Three Position");
        ArrayList<Prova> provas = new ArrayList<Prova>();
        provas.add(prova);
        atirador.setProvas(provas);
        controle.addAtirador(atirador);
    }
    
    @Test
    public void testListaAtiradores(){
        ArrayList<Atirador> atiradores = new ArrayList<Atirador>();
        atiradores.add(atirador);
        assertEquals(atiradores, controle.listaAtirador());
    }
    @Test
    public void testAddAtirador(){
        controle.addAtirador(outroAtirador = new Atirador("Outro"));
        assertEquals(outroAtirador, controle.getAtirador("Outro"));
    }
    @Test
    public void testGetAtirador(){
        assertEquals(atirador, controle.getAtirador("Teste"));
    }
    @Test
    public void testRemoveAtirador(){
        controle.removeAtirador(atirador);
        assertEquals(true, controle.listaAtirador().isEmpty());
    }
    
    
    @Test
    public void testListaAtiradoresNome(){
        ArrayList<Atirador> atiradores = new ArrayList<Atirador>();
        atiradores.add(atirador);
        assertEquals(atiradores, controle.listaAtirador("Te"));
    }
    
    @Test
    public void testListaAtiradoresProva(){
        prova = new Prova(30,"Air Soft","Three Position");
        ArrayList<Prova> provas = new ArrayList<Prova>();
        provas.add(prova);
        atirador.setProvas(provas);
        ArrayList<Atirador> atiradores = new ArrayList<Atirador>();
        atiradores.add(atirador);
        assertEquals(atiradores, controle.listaAtirador(controle.getProvas("30")));
    }
    
    
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
