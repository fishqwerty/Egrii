/*
 * Esta clase es una generalizacion para todos los usuarios de la aplicacion
 * (Administrador, Cliente y Empresa), todo lo que se comparta entre estas 3
 * clases ha de estar aquí.
 */
package models.users;

import java.util.Objects;

/**
 *
 * @author test
 */
abstract class Usuario {
    
    private String codigo; //Equivale al nif en Empresa
    private String nombre;
    private String email;
    private String password;
    private String direccion;

    public Usuario(String codigo, String nombre, String email, String password, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.direccion = direccion;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.codigo, other.codigo);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.codigo);
        return hash;
    }
    
    

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
