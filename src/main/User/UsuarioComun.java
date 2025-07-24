package main.User;

public class UsuarioComun extends Persona{
   
    public UsuarioComun(int dni, String nombre, String password) {
        super(dni, nombre, password);
    }
    
    @Override
    public boolean isAdmin(){
        return false;
    }
}
