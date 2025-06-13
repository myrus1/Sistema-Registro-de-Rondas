package main.Exepciones;

public class PermisoDenegadoException extends RuntimeException {
  private static final String MENSAJE_POR_DEFECTO = "Solo un administrador puede modificar la frecuencia.";

  public PermisoDenegadoException() {
    super(MENSAJE_POR_DEFECTO);
  }

  public PermisoDenegadoException(String mensajePersonalizado) {
    super(mensajePersonalizado); // opcional, por si querés algo distinto
  }
}
