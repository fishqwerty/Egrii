/*
 * Esta clase es el modelo del objeto Empresa.
 */
package models.users;

/**
 *
 * @author test
 */
public class Empresa extends Usuario{
    
    private String telefono;
    private String iban;

    public Empresa(String telefono, String iban, String codigo, String nombre, String email, String password, String direccion) {
        super(codigo, nombre, email, password, direccion);
        this.telefono = telefono;
        this.iban = iban;
    }

    
    
    
}
