package main;
import java.util.Scanner;
import java.util.Vector;
import main.Assets.Componente;
import main.Assets.Sector;

public class Menu {
  
  private Vector<Componente> componetes = new Vector<>();
  
  public void mostrarMenu(){
    Scanner scanner = new Scanner(System.in);
    int opcion = 1;
    while (opcion != 0) {
      
      // Mostrar el menú
      System.out.println("\n--- MENÚ PRINCIPAL ---");
      System.out.println("0. Salir");
      System.out.println("1. Crear sector");
      System.out.println("2. Mostrar sectores");
      System.out.println("3. ...");
      System.out.print("Elige una opción: ");
      
      // Leer la opción del usuario
      opcion = scanner.nextInt();
      scanner.close();

      // Procesar la opción
      switch (opcion) {
        default:
          System.out.println("Opción inválida. Intenta nuevamente.");
          break;
          case 0:
              System.out.println("Saliendo del programa... ¡Hasta luego!");
              break;
          case 1:
            crearSector();
          case 2:
            mostrarSectores();
          case 3:
            break;
        }
    }    
  }


  public void crearSector(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa nombre Sector: ");
    String nombre = scanner.nextLine();
    componetes.add(new Sector(nombre));
    scanner.close();    
  }

  public void mostrarSectores(){
    for (Componente componente : componetes) {
      System.out.println(componente.getNombre());
    }
  }
}
