package User;

public class UsuarioComun extends Persona implements administrador{
    public boolean isAdmin(){
        return false;
    }
}
