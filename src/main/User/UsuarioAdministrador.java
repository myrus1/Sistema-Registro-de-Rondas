package main.User;

public class UsuarioAdministrador extends Persona {
    
    public UsuarioAdministrador(int dni, String nombre, String password) {
        super(dni, nombre, password);
    }

    public boolean isAdmin(){
        return true;
    }
}
