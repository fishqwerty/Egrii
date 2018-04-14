/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.misc;

import models.users.AdministradorEmpresa;
import models.users.Empresa;

/**
 *
 * @author lenovo
 */
public class Producto {
    
    private String codigoProducto;
    private Empresa empresa;
    private Promocion promocion;
    private AdministradorEmpresa adminValidacion;
    private String nombre;
    private String descripcion;
    private Float precio;

    public Producto(String codigoProducto, Empresa empresa, Promocion promocion, AdministradorEmpresa adminValidacion, String nombre, String descripcion, Float precio) {
        this.codigoProducto = codigoProducto;
        this.empresa = empresa;
        this.promocion = promocion;
        this.adminValidacion = adminValidacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public AdministradorEmpresa getAdminValidacion() {
        return adminValidacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecio() {
        return precio;
    }
    
    
    
}
