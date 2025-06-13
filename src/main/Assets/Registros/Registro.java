package main.Assets.Registros;

import java.util.Vector;

/*** Esta clase refiere a los tipos de valores que puede almacenar el equipo
 *   estos pueden ser int, float, string
 *   ademas se puede almacenar uno o varios valores diferentes de cada tipo ejemplo: temperatura, presion, velocidad,etc
***/
public class Registro {
    private Vector<CampoRegistro> campos = new Vector<>();

    public void agregarCampo(CampoRegistro campo) {
        campos.add(campo);
    }

    public Vector<CampoRegistro> getCampos() {
        return campos;
    }
}
