package main.Assets;

import java.util.Vector;

//Componente del Composite
public class Sector implements Componente{
    
    private String nombre;
    private Vector<Componente> componetes = new Vector<>();

    public Sector(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void addComponente(Componente c){
        componetes.add(c);
    }
}

    