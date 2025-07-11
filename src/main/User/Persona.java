package main.User;

public abstract class Persona implements administrador  {
    private String nombre ;
    private int dni;

    
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


    public abstract boolean isAdmin();
}
