package ejercicio2;

//Implementación de la interfaz para el idioma Inglés
public class TraduccionIngles implements Traduccion {
    @Override
    public void introducirLugar() {
        System.out.println("Welcome to our tourist spot.");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Our operating hours are from 9:00 am to 6:00 pm.");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Please wait a moment...");
    }

    @Override
    public void finRespuesta() {
        System.out.println("Thank you for your visit!");
    }
}
