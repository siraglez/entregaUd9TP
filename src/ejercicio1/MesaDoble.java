package ejercicio1;

import java.time.LocalDate;

//Clase para una mesa doble
public class MesaDoble extends MesaBase {
    private String vistaPreferida;

    public MesaDoble(int numero, String ubicacion, FechaReserva fechaUltimaReserva, String vistaPreferida) {
        super(numero, ubicacion, fechaUltimaReserva);
        this.vistaPreferida = vistaPreferida;
    }

    @Override
    public double calcularPrecioReserva() {
        return 4.50; //Precio por hora para mesa doble
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " vista " + vistaPreferida + " " + calcularPrecioReserva() + "€/hora";
    }
}
