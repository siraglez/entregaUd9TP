package ejercicio1;

import java.time.LocalDate;

//Clase para una mesa de grupo
public class MesaGrupo extends MesaBase {
    private int cantidadEnchufes;

    public MesaGrupo(int numero, String ubicacion, FechaReserva fechaUltimaReserva, int cantidadEnchufes) {
        super(numero, ubicacion, fechaUltimaReserva);
        this.cantidadEnchufes = cantidadEnchufes;
    }

    @Override
    public double calcularPrecioReserva() {
        return 7.90; //Precio por hora para mesa de grupo
    }

    @Override
    public String mostrar() {
        return super.mostrar() + " " + cantidadEnchufes + " enchufes " + calcularPrecioReserva() + "€/hora";
    }
}
