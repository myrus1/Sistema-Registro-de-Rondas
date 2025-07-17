package main.User;

public abstract class Persona implements administrador  {
    private String nombre ;
    private String password;
    private int dni;

    public Persona(int dni, String nombre, String password) {
        this.dni = dni;
        this.nombre = nombre;
        this.password = password;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getDni() {
        return dni;
    }


    public void setDni(int dni) {
        this.dni = dni;
    }


    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public abstract boolean isAdmin();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
