package ejercicio1;

import java.util.ArrayList;
import java.util.List;

//Clase para gestionar la tabla de reservas
public class TablaReservas {
    private List<Mesa> mesas;

    public TablaReservas() {
        this.mesas = new ArrayList<>();
    }

    public void agregarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void mostrarMesas() {
        System.out.println("Estas son las mesas que ofrecemos para reservar: ");
        for (Mesa mesa : mesas) {
            System.out.println(mesa.mostrar());
        }
    }
}
