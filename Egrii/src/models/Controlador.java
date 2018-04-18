/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.users.Cliente;
import models.users.Usuario;


/**
 *
 * @author sabela
 */
public interface Controlador {
    
    
    
    public void nuevoRegistro();
    public boolean loggeado(Usuario user);
    public Usuario obtenerUsuario(String email);

    public boolean existeUsuario(String text, String text0, String text1, String text2, String text3, String text4);

    public void registrarUsuario(String text, String text0, String text1, String text2, String text3, String text4);

    public Usuario comprobarAutentificacion(String text, String text0);
}
