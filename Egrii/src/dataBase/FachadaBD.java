/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import gui.FachadaGUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import models.users.Usuario;

/**
 *
 * @author test
 */
public class FachadaBD {

    private java.sql.Connection conexion;
    private FachadaGUI fgui;
    private DAOUsuarios daoUsuarios;
    private DAOAdministracion daoAdministracion;

    public FachadaBD(FachadaGUI fgui) {
        Properties configuracion = new Properties();

        FileInputStream arqConfiguracion;

        try {
            arqConfiguracion = new FileInputStream("baseDatos.properties");
            configuracion.load(arqConfiguracion);
            arqConfiguracion.close();

            Properties usuario = new Properties();

            String gestor = configuracion.getProperty("gestor");

            usuario.setProperty("user", configuracion.getProperty("usuario"));
            usuario.setProperty("password", configuracion.getProperty("clave"));
            this.conexion=java.sql.DriverManager.getConnection("jdbc:"+gestor+"://"+
                    configuracion.getProperty("servidor")+":"+
                    configuracion.getProperty("puerto")+"/"+
                    configuracion.getProperty("baseDatos"),
                    usuario);

            daoUsuarios = new DAOUsuarios(conexion, fgui);
            daoAdministracion = new DAOAdministracion(conexion, fgui);
            this.fgui =fgui;
            
          
        } catch (FileNotFoundException f){
            System.out.println(f.getMessage());
            //fa.muestraExcepcion(f.getMessage());
        } catch (IOException i){
            System.out.println(i.getMessage());
            //fa.muestraExcepcion(i.getMessage());
        } 
        catch (java.sql.SQLException e){
            System.out.println(e.getMessage());
            //fa.muestraExcepcion(e.getMessage());
        }
    }
    
    public Usuario comprobarAutentificacion(Usuario user) {
        return daoUsuarios.comprobarAutentificacion(user);
    }
    
    
}
