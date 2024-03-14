package ejercicio1;

import java.time.LocalDate;

//Clase abstracta para la implementación básica de las mesas
public abstract class MesaBase implements Mesa {
    protected int numero;
    protected String ubicacion;
    protected FechaReserva fechaUltimaReserva;

    public MesaBase(int numero, String ubicacion, FechaReserva fechaUltimaReserva) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.fechaUltimaReserva = fechaUltimaReserva;
    }

    //Método para mostrar información básica de la mesa
    public String mostrar() {
        return "Mesa " + getClass().getSimpleName() + " nº" + numero + " (" + ubicacion + ")";
    }
}
