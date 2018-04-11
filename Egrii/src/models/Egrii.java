/*
 * Esta clase se encarga de lanzar la aplicacion e inicializar todo lo necesario
 */
package models;

import gui.FachadaGUI;
import models.users.Cliente;

/**
 *
 * @author test
 */
public class Egrii implements Controlador{

    /**
     * @param args the command line arguments
     */
    
    private FachadaGUI gui;
    
    public Egrii(){
        gui = new FachadaGUI(this);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Egrii();
    }

    @Override
    public void nuevoRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comprobarAutentificacion(String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void loggeado(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente obtenerUsuario(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
