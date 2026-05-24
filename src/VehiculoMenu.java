import java.util.ArrayList;
import java.util.Scanner;

public class VehiculoMenu {

    ArrayList<Vehiculo> registroVehiculos = new ArrayList<Vehiculo>();
    Scanner scanner = new Scanner(System.in);

    public void menu() {

        int opcion = 0;

        do {

            System.out.println("\n=======================================");
            System.out.println("         REGISTRO DE VEHICULOS         ");
            System.out.println("=======================================");
            System.out.println(" 1. Registrar vehiculo                 ");
            System.out.println(" 2. Mostrar vehiculos                  ");
            System.out.println(" 3. Buscar vehiculo por placa          ");
            System.out.println(" 4. Mostrar vehiculos por marca        ");
            System.out.println(" 5. Salir                              ");
            System.out.println("=======================================");
            System.out.println("\nDigite la opcion que desea seleccionar: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            

        } while (opcion != 5);

    }
}
