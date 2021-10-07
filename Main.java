import java.util.Scanner;

public class Main {

  public static void showMenu() {
    System.out.print("\n Ingresa una opcion: ");
    System.out.println(
        "\n 1) Crear proceso \n 2) Ver proceso actual \n 3) Imprimir cola de procesos \n 4) Ver estado del sistema \n 5) Ejecutar proceso actual \n 6) Pasar al siguiente proceso \n 7) Matar al proceso actual \n 8) Salir");
    System.out.print("\n Opcion seleccionada: ");
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // ProcessManager manager = new ProcessManager();
    int response;

    do {
      showMenu();
      response = Integer.parseInt(sc.nextLine());

      switch (response) {
        case 1:
          System.out.println("\n *** Crear proceso ***");
          break;

        case 2:
          System.out.println("\n *** Ver proceso actual ***");
          break;

        case 3:
          System.out.println("\n *** Imprimir cola de procesos ***");
          break;

        case 4:
          System.out.println("\n *** Ver estado del sistema ***");
          break;

        case 5:
          System.out.println("\n *** Ejecutar proceso actual ***");
          break;

        case 6:
          System.out.println("\n *** Pasar al siguiente proceso ***");
          break;

        case 7:
          System.out.println("\n *** Matar proceso actual ***");
          break;

        case 8:
          System.out.println("\n *** Salir ***");
          break;

        default:
          break;
      }
    } while (response != 8);

    sc.close();
  }
}