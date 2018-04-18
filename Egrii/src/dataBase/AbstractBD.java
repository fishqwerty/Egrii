/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import gui.FachadaGUI;
import java.sql.Connection;

/**
 *
 * @author test
 */
abstract class AbstractBD {
    
    //private aplicacion.FachadaAplicacion fa;
    private java.sql.Connection conexion;
    private FachadaGUI fgui;

    public AbstractBD(Connection conexion, FachadaGUI fgui) {
        this.conexion = conexion;
        this.fgui = fgui;
    }
    
   
    protected java.sql.Connection getConexion(){
        return this.conexion;
    }
    
    protected void setConexion(java.sql.Connection conexion){
        this.conexion=conexion;
    }

    public FachadaGUI getFgui() {
        return fgui;
    }
 
    
}
