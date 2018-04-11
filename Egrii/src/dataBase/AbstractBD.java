/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.sql.Connection;

/**
 *
 * @author test
 */
abstract class AbstractBD {
    
    private java.sql.Connection conexion;

    public AbstractBD(Connection conexion) {
        this.conexion = conexion;
    }

    
   
    protected java.sql.Connection getConexion(){
        return this.conexion;
    }
    
    protected void setConexion(java.sql.Connection conexion){
        this.conexion=conexion;
    }
}
