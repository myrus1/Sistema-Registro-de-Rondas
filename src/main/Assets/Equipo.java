package main.Assets;
//import java.util.Date;
import main.Assets.Registros.Registro;


//Hoja del Composite
public class Equipo implements Componente {
    private String nombre;
    private Registro registro;
    //private Frecuencia frecuencia;
    //private Date fechaIncorporacion;
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public void setRegistro(Registro r){
        this.registro=r;
    }
    
    public Registro getRegistro() {
        return registro;
    }
    
    /*public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Frecuencia getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Frecuencia frecuencia) {
            this.frecuencia = frecuencia;
    }*/
}
