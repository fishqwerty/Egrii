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
    public boolean comprobarAutentificacion(Usuario user);
    public boolean loggeado(Usuario user);
    public Usuario obtenerUsuario(String email);
    public boolean existeUsuario(Usuario user);
    public void registrarUsuario(Cliente user);
}
