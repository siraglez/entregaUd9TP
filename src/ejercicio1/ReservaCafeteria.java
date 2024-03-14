package ejercicio1;

import java.time.LocalDate;

//Clase para gestionar y mostrar mesas disponibles
public class ReservaCafeteria {
    public static void main(String[] args) {
        //Crear la fecha de última reserva
        FechaReserva fechaReserva = new FechaReserva(LocalDate.now());

        //Crear la tabla de reservas
        TablaReservas tablaReservas = new TablaReservas();

        //Agregar mesas de ejemplo a la tabla de reservas
        tablaReservas.agregarMesa(new MesaIndividual(5, "interior", fechaReserva, "jardín"));
        tablaReservas.agregarMesa(new MesaDoble(10, "terraza", fechaReserva, "calle"));
        tablaReservas.agregarMesa(new MesaGrupo(20, "interior", fechaReserva, 6));

        //Mostrar las mesas disponibles
        tablaReservas.mostrarMesas();
    }
}
