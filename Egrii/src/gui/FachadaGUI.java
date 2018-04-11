/*
 * Esta clase se encarga de lanzar todas las interfaces de usuario requeridas
 * por la aplicacion.
 */
package gui;

import java.awt.Frame;
import models.Controlador;

/**
 *
 * @author test
 */
public class FachadaGUI {
    
    private final Controlador controlador;
    private Frame vPrincipal;

    public FachadaGUI(Controlador controlador) {
        this.controlador = controlador;
        vPrincipal = new Login(controlador);
        
    }
    
    

}
