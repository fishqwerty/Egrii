/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.misc;

import java.util.Date;
import models.users.Empresa;

/**
 *
 * @author lenovo
 */
public class Promocion {
    
    private String codigoPromocion;
    private Empresa empresa;
    private String nombre;
    private Date fechaIncio;
    private Date fechaFin;
    private Float descuento;

    public Promocion(String codigoPromocion, Empresa empresa, String nombre, Date fechaIncio, Date fechaFin, Float descuento) {
        this.codigoPromocion = codigoPromocion;
        this.empresa = empresa;
        this.nombre = nombre;
        this.fechaIncio = fechaIncio;
        this.fechaFin = fechaFin;
        this.descuento = descuento;
    }

    public String getCodigoPromocion() {
        return codigoPromocion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaIncio() {
        return fechaIncio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public Float getDescuento() {
        return descuento;
    }
    
    
    
}
