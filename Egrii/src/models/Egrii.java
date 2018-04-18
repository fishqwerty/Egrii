/*
 * Esta clase se encarga de lanzar la aplicacion e inicializar todo lo necesario
 */
package models;

import dataBase.FachadaBD;
import gui.FachadaGUI;
import models.users.Cliente;
import models.users.Usuario;

/**
 *
 * @author test
 */
public class Egrii implements Controlador{

    /**
     * @param args the command line arguments
     */
    
    private FachadaGUI gui;
    private FachadaBD fbd;
    
    public Egrii(){
        gui = new FachadaGUI(this);
        fbd = new FachadaBD();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        new Egrii();
    }

    @Override
    public void nuevoRegistro() {
        gui.nuevoUsuario();
    }

    @Override
    public boolean loggeado(Usuario user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtenerUsuario(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean existeUsuario(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarUsuario(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario comprobarAutentificacion(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
