/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import models.users.Cliente;


/**
 *
 * @author sabela
 */
public interface Controlador {
    
    
    
    public void nuevoRegistro();
    public boolean comprobarAutentificacion(String email, String password);
    public void loggeado(String email);
    public Usuario obtenerUsuario(String email);
    public boolean existeUsuario(String email);
    public void funcionManuel();
}
