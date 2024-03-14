package ejercicio2;

import java.util.Scanner;

//Clase principal que utiliza la guía turística multilingüe
public class GuiaTuristica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elija el idioma deseado (1. Español, 2. Inglés): ");
        int opcion = scanner.nextInt();

        Traduccion traduccion;
        if (opcion == 1) {
            traduccion = new TraduccionEspaniol();
        } else if (opcion == 2) {
            traduccion = new TraduccionIngles();
        } else {
            System.out.println("Opción no válida, seleccionando Español por defecto.");
            traduccion = new TraduccionEspaniol();
        }

        traduccion.inicioRespuesta();
        traduccion.introducirLugar();
        traduccion.introducirHorario();
        traduccion.finRespuesta();

        scanner.close();
    }
}
