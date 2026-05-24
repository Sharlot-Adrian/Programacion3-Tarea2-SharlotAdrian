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

            switch(opcion){
                case 1:{
                    System.out.println("\n[ REGISTRAR VEHICULO ]"); //Atributos de un Vehiculo: 
                    // String placa, String marca
                    //String modelo, int year, String color, double precio
                    System.out.println("*---------------------------------*");
                    System.out.println("Ingrese la placa: ");
                    String placa = scanner.nextLine();

                    System.out.println("Ingrese la marca: ");
                    String marca = scanner.nextLine();

                    System.out.println("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.println("Ingrese el año: ");
                    int year = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el color: ");
                    String color = scanner.nextLine();

                    System.out.println("Ingrese el precio: ");
                    double precio = scanner.nextDouble();

                    registroVehiculos.add(new Vehiculo(placa, marca, modelo, year, color, precio));

                    break;
                }
                case 2:{

                    System.out.println("[ MOSTRAR VEHICULOS ]");
                    for (int i = 0; i < registroVehiculos.size(); i++){
                        registroVehiculos.get(i).mostrarInformacionGeneral();
                    }

                    break;
                }
                case 3:{
                    System.out.println("\n[ BUSCAR VEHICULO POR PLACA ]");
                    System.out.println("*---------------------------------*");
                    System.out.println("Ingrese la placa del vehiculo que desea buscar: ");
                    String placaBuscada = scanner.nextLine();

                    for (int i = 0; i < registroVehiculos.size(); i++){
                        if (placaBuscada.equals(registroVehiculos.get(i).getPlaca())){
                            System.out.println("¡Vehiculo encontrado!");
                            registroVehiculos.get(i).mostrarInformacionGeneral();
                        }
                        else
                            System.out.println("Vehiculo no encontrado.");
                    }


                    break;
                }
                case 4:{
                    System.out.println("[MOSTRAR VEHICULOS POR MARCA ]");
                    System.out.println("*---------------------------------*");

                    for (int i = 0; i < registroVehiculos.size();i++){
                        System.out.print("\nVehiculo #"+ (i+1)+": ");
                        registroVehiculos.get(i).getMarca();
                    }

                    break;
                }
                case 5:{
                    break;
                }
                default:{
                    System.out.println("Esa opcion no es valida.");
                    break;
                }

            }

        } while (opcion != 5);

    }
}
