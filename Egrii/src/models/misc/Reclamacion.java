/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.misc;

import java.util.Date;
import models.users.AdministradorCliente;

/**
 *
 * @author lenovo
 */
public class Reclamacion {
    
    private String codigoCliente;
    private Date fechaEnvio;
    private String descripción;
    private Date fechaResolucion;
    private AdministradorCliente admin;

    public Reclamacion(String codigoCliente, Date fechaEnvio, String descripción, Date fechaResolucion, AdministradorCliente admin) {
        this.codigoCliente = codigoCliente;
        this.fechaEnvio = fechaEnvio;
        this.descripción = descripción;
        this.fechaResolucion = fechaResolucion;
        this.admin = admin;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public String getDescripción() {
        return descripción;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public AdministradorCliente getAdmin() {
        return admin;
    }
    
    
}
