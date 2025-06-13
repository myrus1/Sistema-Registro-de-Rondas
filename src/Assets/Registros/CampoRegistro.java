package Assets.Registros;

public class CampoRegistro {
    private String nombre;
    private TipoDato tipo;
    private Object valor;

    public CampoRegistro(String nombre, TipoDato tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setValor(Object valor) {
        if (!tipo.esValido(valor)) {
            throw new IllegalArgumentException("Valor inválido para el tipo " + tipo.name());
        }
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }

    public TipoDato getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    // Si te llega un String desde UI o archivo, podés usar:
    public void setValorDesdeTexto(String texto) {
        this.valor = tipo.parse(texto);
    }
}