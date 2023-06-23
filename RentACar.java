package rentacar;

import java.util.Scanner;

public class Ejecutable{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de reservas de autos");
        System.out.println("Cuantas reservas de auto va a hacer?");
        
        
        

        // Crear instancia de Auto con los datos ingresados
        Auto auto = new Auto(matricula, modelo, color, marca, precio);

        scanner.nextLine(); // Limpiar el búfer de entrada

        System.out.println("\nIngrese los datos del cliente:");

        System.out.print("DNI: ");
        int dni = scanner.nextInt();

        scanner.nextLine(); // Limpiar el búfer de entrada

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Teléfono: ");
        int telefono = scanner.nextInt();

        System.out.print("Código: ");
        double codigo = scanner.nextDouble();

        // Crear instancia de Cliente con los datos ingresados
        Cliente cliente = new Cliente(dni, nombre, direccion, telefono, codigo);

        // Imprimir información del auto y del cliente
        System.out.println("\n==== Información del Auto ====");
        System.out.println(auto.toString());
        System.out.println("==== Información del Cliente ====");
        System.out.println(cliente.mostrarCliente());

        // Generar ticket de compra
        System.out.println("\n==== Ticket de Compra ====");
        System.out.println("Detalles de la compra:");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Auto: " + auto.getMarca() + " " + auto.getModelo());
        System.out.println("Precio: $" + auto.getPrecio());
        System.out.println("Gracias por su compra!");

        scanner.close();
    }
}
