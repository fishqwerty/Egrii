/*
 * Esta clase se encarga de lanzar la aplicacion e inicializar todo lo necesario
 */
package models;

import dataBase.FachadaBD;
import gui.FachadaGUI;

/**
 *
 * @author test
 */
public class Egrii implements Controlador {
    
    private FachadaBD baseDatos;
    private FachadaGUI gui;

    public Egrii() {
        
       baseDatos = new FachadaBD();
       gui = new FachadaGUI(this);
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Egrii();
        
    }
    
}
