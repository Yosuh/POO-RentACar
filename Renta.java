package rentacar;
import java.time.LocalDate;
import java.util.ArrayList;

public class Renta {
   
   private int cantDias;
    private int nroReserva;
    private static int cantReservas;
    private Cliente cli;
    private LocalDate fechaInicio = LocalDate.now();
    private LocalDate fechaFinal;
    private ArrayList<Auto> auto;

    public Renta(int cantDias, Cliente cli) {
        this.cantDias = cantDias;
        this.nroReserva = Renta.cantReservas++;
        this.fechaFinal = calcularFechaFin();
        this.cli = cli;
        this.auto = new ArrayList<>();
    }

    public Renta(int cantDias, Cliente cli, LocalDate fechaFinal) {
        this.cantDias = cantDias;
        this.nroReserva = Renta.cantReservas++;
        this.fechaFinal = fechaFinal;
        this.cli = cli;
        this.auto = new ArrayList<>();
    }

    public double calcularTotalPagar() {
        double total = 0.0;
        for (Auto a : auto) {
            total += a.getPrecioAlquiler();
        }
        return total;
    }

    public void imprimirTicket() {
        System.out.println("----- Ticket de Renta -----");
        System.out.println("Número de Reserva: " + nroReserva);
        System.out.println("Cliente: " + cli.getNombre());
        System.out.println("Fecha de Inicio: " + fechaInicio);
        System.out.println("Fecha Final: " + fechaFinal);
        System.out.println("Autos alquilados:");
        for (Auto a : auto) {
            System.out.println(a.toString());
        }
        System.out.println("Total a pagar: " + calcularTotalPagar());
        System.out.println("---------------------------");
    }

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

    public int getNroReserva() {
        return nroReserva;
    }

    public void setNroReserva(int nroReserva) {
        this.nroReserva = nroReserva;
    }

    public static int getCantReservas() {
        return cantReservas;
    }

    public static void setCantReservas(int cantReservas) {
        Renta.cantReservas = cantReservas;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public ArrayList<Auto> getAuto() {
        return auto;
    }

    public void setAuto(ArrayList<Auto> auto) {
        this.auto = auto;
    }

    public void addAutos(Auto a) {
        this.auto.add(a);
    }
   
}

    

