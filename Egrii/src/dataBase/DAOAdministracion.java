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
class DAOAdministracion extends AbstractBD{
    
    public DAOAdministracion(Connection conexion, FachadaGUI fgui) {
        super(conexion, fgui);
    }
    
}
