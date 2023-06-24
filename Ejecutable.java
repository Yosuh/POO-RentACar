package ejecutable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al cliente que ingrese sus datos
        System.out.println("Ingrese los datos del cliente:");
        System.out.print("DNI: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Teléfono: ");
        int telefono = scanner.nextInt();
        System.out.print("Código: ");
        double codigo = scanner.nextDouble();

        // Crear objeto de cliente con los datos ingresados
        Cliente cliente = new Cliente(dni, nombre, direccion, telefono, codigo);

        // Crear objetos de autos
        Auto auto1 = new Auto("ABC123", "Toyota Corolla", "Rojo", "Toyota", 50.0);
        Auto auto2 = new Auto("DEF456", "Ford Focus", "Azul", "Ford", 60.0);

        // Crear objeto de reserva para el cliente
        Renta reservaCliente = new Renta(5, 1, cliente);
        reservaCliente.setFechaInicio(LocalDate.now());
        reservaCliente.setFechaFinal(LocalDate.now().plusDays(5));
        reservaCliente.addAutos(auto1);
        reservaCliente.addAutos(auto2);

        // Calcular precio total de la reserva
        double precioTotal = 0;
        for (Auto auto : reservaCliente.getAuto()) {
            precioTotal += auto.getPrecio();
        }

        // Imprimir comprobante de reserva
        System.out.println("COMPROBANTE DE RESERVA");
        System.out.println("Cliente: " + reservaCliente.getCli().getNombre());
        System.out.println("DNI: " + reservaCliente.getCli().getDni());
        System.out.println("Dirección: " + reservaCliente.getCli().getDireccion());
        System.out.println("Teléfono: " + reservaCliente.getCli().getTelefono());
        System.out.println("Fecha de inicio: " + reservaCliente.getFechaInicio());
        System.out.println("Fecha de fin: " + reservaCliente.getFechaFinal());
        System.out.println("Autos alquilados:");
        for (Auto auto : reservaCliente.getAuto()) {
            System.out.println("- " + auto.getMarca() + " " + auto.getModelo() + " (" + auto.getMatricula() + ")");
        }
        System.out.println("Precio total: $" + precioTotal);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
