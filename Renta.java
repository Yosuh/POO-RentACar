

package rentacar;
import java.time.LocalDate;
import java.util.ArrayList;

public class Renta {
   
    private int cantDias;
    private int nroReserva;
    private static int cantReservas;
    private Cliente cli;
    private LocalDate fechaInicio= LocalDate.now();
    private LocalDate fechaFinal;
    private ArrayList<Auto> auto;

    public Renta(int cantDias, int nroReserva, Cliente cli) {
        this.cantDias = cantDias;
        this.nroReserva = nroReserva;
        this.cli = cli;
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

    


    

