package Assets;
import Assets.Registros.Registro;

import java.util.Date;
import java.util.Vector;


//Hoja del Composite
public class Equipo implements Componente {
    private String nombre;
    private Date fechaIncorporacion;
    private Frecuencia frecuencia;
    private Registro registro;
   
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaIncorporacion() {
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
    }

    public void setRegistro(Registro r){
        this.registro=r;
    }

    public Registro getRegistro() {
        return registro;
    }

}
