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
      System.out.println("3. Borrar sector");
      System.out.print("Elige una opción: ");
      
      // Leer la opción del usuario
      opcion = scanner.nextInt();
      
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
            break;
          case 2:
            mostrarSectores();
            break;
          case 3:
            borrarSector();
            break;
        }
      }    
      scanner.close();
  }


  public void crearSector(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa nombre Sector: ");
    String nombre = scanner.nextLine();
    componetes.add(new Sector(nombre));
    //scanner.close();    
  }

  public void borrarSector(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el ID del sector a borrar: ");
    try{
      int id = scanner.nextInt();
      componetes.remove(id);
    }catch(Exception e){
      System.out.println("Opción inválida. Intenta nuevamente.");
    }
    
  }
  public void mostrarSectores(){
    System.out.println("\nSectores:\n" );
    for (Componente componente : componetes) {
      System.out.println( componetes.indexOf(componente) + " - " + componente.getNombre());
    }
  }

  /* 
  
  ***Falta implementar la creación de equipos y registros***  
  
  public void crearEquipo(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa el nombre del equipo: ");
    String nombre= scanner.nextLine();

    
  }
  */
}
