package ejercicio1;

import java.time.LocalDate;

//Clase para una mesa individual
public class MesaIndividual extends MesaBase {
    private String vistaPreferida;

    public MesaIndividual(int numero, String ubicacion, FechaReserva fechaUltimaReserva, String vistaPreferida) {
        super(numero, ubicacion, fechaUltimaReserva);
        this.vistaPreferida = vistaPreferida;
    }

    @Override
    public double calcularPrecioReserva() {
        return 2.50; //Precio por hora para mesa individual
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " vista " + vistaPreferida + " " + calcularPrecioReserva() + "€/hora";
    }
}
