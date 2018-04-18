/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import gui.FachadaGUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.users.Usuario;

/**
 *
 * @author test
 */
class DAOUsuarios extends AbstractBD {

    public DAOUsuarios(Connection conexion, FachadaGUI fgui) {
        super(conexion, fgui);
    }

    public Usuario comprobarAutentificacion(Usuario user) {
        Usuario aux = null;
        Connection con;
        PreparedStatement stmUsuario = null;
        ResultSet rsUsuario;

        con = this.getConexion();

        try {
            stmUsuario = con.prepareStatement("select codigo, nombre, email, password, direccion " +
                    "from administrador " +
                    "where email=? and password=? "+
                    "UNION "+
                    "select codigo, nombre, email, password, direccion " +
                    "from cliente " +
                    "where email=? and password=? ");
            stmUsuario.setString(1, user.getEmail());
            stmUsuario.setString(2, user.getPassword());
            stmUsuario.setString(3, user.getEmail());
            stmUsuario.setString(4, user.getPassword());
            rsUsuario= stmUsuario.executeQuery();
            if(rsUsuario.next()){
                aux = new Usuario(rsUsuario.getString("codigo"), rsUsuario.getString("nombre"), 
                        rsUsuario.getString("email"), rsUsuario.getString("password"), rsUsuario.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            this.getFgui().imprimirMensaje(e.getMessage());
        }finally{
            try{
                stmUsuario.close();
            }catch(SQLException e){
                System.out.println("Imposible cerrar cursores");
                }
        } 
        
        return aux;
    }
}
