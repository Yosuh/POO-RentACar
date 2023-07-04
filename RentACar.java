package rentacar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class RentACar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear autos disponibles
        Auto auto1 = new Auto("ABC123", "Toyota Corolla", "Rojo", "Toyota", 18500.0);
        Auto auto2 = new Auto("DEF456", "Ford Focus", "Azul", "Ford", 275236.);

        // Almacenar autos disponibles en un ArrayList
        ArrayList<Auto> autosDisponibles = new ArrayList<>();
        autosDisponibles.add(auto1);
        autosDisponibles.add(auto2);

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
        
        
         // Solicitar la duración de la renta o la fecha de devolución
        System.out.println("Seleccione una opción:");
        System.out.println("1. Ingresar la duración de la renta en días");
        System.out.println("2. Ingresar una fecha específica de devolución");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        
        
        LocalDate fechaFinal;
        if (opcion == 1) {
            System.out.print("Duración de la renta en días: ");
            int duracion = scanner.nextInt();
            fechaFinal = LocalDate.now().plusDays(duracion);
        } else {
            System.out.print("Fecha de devolución (formato: dd/MM/yyyy): ");
            String fechaString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            fechaFinal = LocalDate.parse(fechaString, formatter);
        }

        // Crear objeto de cliente con los datos ingresados
        Cliente cliente = new Cliente(dni, nombre, direccion, telefono, codigo);

        // Mostrar opciones de autos disponibles
        System.out.println("Autos disponibles:");
        for (int i = 0; i < autosDisponibles.size(); i++) {
            Auto auto = autosDisponibles.get(i);
            System.out.println(i + 1 + ". " + auto.getMarca() + " " + auto.getModelo());
        }

        // Solicitar al usuario que elija un auto
        System.out.print("Seleccione el número de auto deseado: ");
        int opcionAuto = scanner.nextInt(); 

        // Obtener el auto elegido por el usuario
        Auto autoElegido = autosDisponibles.get(opcionAuto - 1);

        // Crear objeto de reserva para el cliente
        Renta reservaCliente = new Renta(5, 1, cliente);
        reservaCliente.setFechaInicio(LocalDate.now());
        reservaCliente.setFechaFinal(fechaFinal);
        reservaCliente.addAutos(autoElegido);

        // Calcular precio total de la reserva
        double precioTotal = autoElegido.getPrecio();

        // Imprimir comprobante de reserva
        System.out.println("COMPROBANTE DE RESERVA");
        System.out.println("Cliente: " + reservaCliente.getCli().getNombre());
        System.out.println("DNI: " + reservaCliente.getCli().getDni());
        System.out.println("Dirección: " + reservaCliente.getCli().getDireccion());
        System.out.println("Teléfono: " + reservaCliente.getCli().getTelefono());
        System.out.println("Fecha de inicio: " + reservaCliente.getFechaInicio());
        System.out.println("Fecha de fin: " + reservaCliente.getFechaFinal());
        System.out.println("Auto alquilado:");
        System.out.println("- " + autoElegido.getMarca() + " " + autoElegido.getModelo() + " (" + autoElegido.getMatricula() + ")");
        System.out.println("Precio total: $ " + precioTotal + " Dólares ");

        scanner.close();
    }
}