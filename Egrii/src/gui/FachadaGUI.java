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
    
    public final Controlador controlador;
    private Frame vPrincipal;
    
    public FachadaGUI(Controlador controlador){
        this.controlador = controlador;
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                vPrincipal = new Login(controlador);
                vPrincipal.setVisible(true);
            }
        });
    }
    
    public void nuevoUsuario(){
        Registro reg;
        
        reg=new Registro(vPrincipal, true, controlador);
        reg.setVisible(true);
    }
    
    public void imprimirMensaje(String mensaje){
        VAviso va;
       
       va = new VAviso(vPrincipal, true, mensaje);
       va.setVisible(true);
    }
}
