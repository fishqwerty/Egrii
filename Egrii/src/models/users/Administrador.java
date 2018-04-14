/*
 * En esta clase solo se pondran los metodos o atributos que los administradores
 * compartan. Los metodos seran sobreescritos por cada tipo de administrador
 * para que se adecue a la funcion que le corresponde a cada uno.
 */
package models.users;

/**
 *
 * @author test
 */
public abstract class Administrador extends Usuario{

    public Administrador(String codigo, String nombre, String email, String password, String direccion) {
        super(codigo, nombre, email, password, direccion);
    }
    
    
}
