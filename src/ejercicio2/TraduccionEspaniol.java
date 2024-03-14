package ejercicio2;

//Implementación de la interfaz para el idioma Español
public class TraduccionEspaniol implements Traduccion {
    @Override
    public void introducirLugar() {
        System.out.println("Bienvenido a nuestro lugar turístico.");
    }

    @Override
    public void introducirHorario() {
        System.out.println("Nuestro horario es de 9:00 am a 6:00 pm.");
    }

    @Override
    public void inicioRespuesta() {
        System.out.println("Por favor, espere un momento...");
    }

    @Override
    public void finRespuesta() {
        System.out.println("¡Gracias por su visita!");
    }
}
