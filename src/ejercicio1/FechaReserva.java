package ejercicio1;

import java.time.LocalDate;

//Clase para gestionar la fecha de última reserva
public class FechaReserva {
    private LocalDate fechaUltimaReserva;

    public FechaReserva(LocalDate fechaUltimaReserva) {
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    public LocalDate getFechaUltimaReserva() {
        return fechaUltimaReserva;
    }

    public void setFechaUltimaReserva(LocalDate fechaUltimaReserva) {
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    @Override
    public String toString() {
        return fechaUltimaReserva.toString();
    }
}
