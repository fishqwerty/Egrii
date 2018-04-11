/*
 * Esta clase es el modelo del objeto Cliente.
 */
package models.users;

/**
 *
 * @author test
 */
public class Cliente extends Usuario{
    
    private String telefono;
    private String iban;

    public Cliente(String telefono, String iban, String codigo, String nombre, String email, String password, String direccion) {
        super(codigo, nombre, email, password, direccion);
        this.telefono = telefono;
        this.iban = iban;
    }
    
    
}
