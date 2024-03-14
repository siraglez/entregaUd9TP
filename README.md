link al repositorio: https://github.com/siraglez/entregaUd9TP.git


# Ejercicio 1: Sistema de Reservas para una Cafetería

Este código Java está organizado en varios paquetes y contiene varias clases e interfaces que trabajan juntas para gestionar las reservas de una cafetería. A continuación, se explican cada una de las partes del código:

## 1. Clase `FechaReserva`

Esta clase gestiona la fecha de última reserva. Tiene un atributo `fechaUltimaReserva` de tipo `LocalDate` y métodos para obtener y establecer esta fecha, así como un método `toString` para representar la fecha como una cadena de texto.

## 2. Interfaz `Mesa`

Esta interfaz define los métodos comunes que deben implementar todas las mesas. Incluye un método `calcularPrecioReserva()` para calcular el precio de la reserva y un método `mostrar()` para mostrar la información de la mesa.

## 3. Clase abstracta `MesaBase`

Esta clase abstracta proporciona una implementación básica de las mesas. Tiene atributos para el número de mesa, la ubicación y la fecha de última reserva. También implementa la interfaz `Mesa` y proporciona un método para mostrar información básica de la mesa.

## 4. Clases concretas `MesaIndividual`, `MesaDoble` y `MesaGrupo`

Estas clases representan diferentes tipos de mesas ofrecidas en la cafetería. Cada una extiende `MesaBase` y proporciona implementaciones específicas para el método `calcularPrecioReserva()` y `mostrar()`.

## 5. Clase `TablaReservas`

Esta clase gestiona una lista de mesas ofrecidas en reserva. Tiene un atributo `mesas` que es una lista de mesas y métodos para agregar mesas a la lista y mostrar todas las mesas disponibles.

## 6. Clase `ReservaCafeteria`

Esta clase contiene el método `main` que actúa como punto de entrada del programa. En este método, se crea una instancia de `FechaReserva` para representar la fecha actual, se crea una instancia de `TablaReservas` y se agregan mesas de ejemplo a la tabla. Luego, se muestra la lista completa de mesas disponibles.

# Pseudocódigo

```java
Clase FechaReserva
    Atributos
        fechaUltimaReserva: fecha
    Métodos
        Constructor FechaReserva(fechaUltimaReserva)
            fechaUltimaReserva <- fechaUltimaReserva
        Función getFechaUltimaReserva(): fecha
            Devuelve fechaUltimaReserva
        Subrutina setFechaUltimaReserva(fechaUltimaReserva)
            fechaUltimaReserva <- fechaUltimaReserva
        Función toString(): cadena
            Devuelve fechaUltimaReserva.toString()
Interfaz Mesa
    Métodos
        Función calcularPrecioReserva(): número
        Función mostrar(): cadena
Clase abstracta MesaBase que implementa Mesa
    Atributos
        numero: entero
        ubicacion: cadena
        fechaUltimaReserva: FechaReserva
    Métodos
        Constructor MesaBase(numero, ubicacion, fechaUltimaReserva)
        Función mostrar(): cadena
            Devuelve "Mesa " + nombre de la clase + " nº" + numero + " (" + ubicacion + ")"
Clase MesaIndividual que hereda de MesaBase
    Atributos
        vistaPreferida: cadena
    Métodos
        Constructor MesaIndividual(numero, ubicacion, fechaUltimaReserva, vistaPreferida)
        Implementación del método calcularPrecioReserva(): número
            Devuelve 2.50
        Implementación del método mostrar(): cadena
Clase MesaDoble que hereda de MesaBase
    Atributos
        vistaPreferida: cadena
    Métodos
        Constructor MesaDoble(numero, ubicacion, fechaUltimaReserva, vistaPreferida)
        Implementación del método calcularPrecioReserva(): número
            Devuelve 4.50
        Implementación del método mostrar(): cadena
            Devuelve super.mostrar() + " vista " + vistaPreferida + " " + calcularPrecioReserva() + "€/hora"
Clase MesaGrupo que hereda de MesaBase
    Atributos
        cantidadEnchufes: entero
    Métodos
        Constructor MesaGrupo(numero, ubicacion, fechaUltimaReserva, cantidadEnchufes)
        Implementación del método calcularPrecioReserva(): número
            Devuelve 7.90
        Implementación del método mostrar(): cadena
            Devuelve super.mostrar() + " " + cantidadEnchufes + " enchufes " + calcularPrecioReserva() + "€/hora"
Clase TablaReservas
    Atributos
        mesas: lista de Mesa
    Métodos
        Constructor TablaReservas()
        Subrutina agregarMesa(mesa)
            Agregar mesa a la lista de mesas
        Subrutina mostrarMesas()
            Para cada mesa en la lista de mesas
                Imprimir mesa.mostrar()
Clase ReservaCafeteria
    Métodos
        Subrutina main(args)
            Definir fechaReserva como una nueva instancia de FechaReserva con la fecha actual
            Definir tablaReservas como una nueva instancia de TablaReservas
            Definir mesa1 como una nueva instancia de MesaIndividual con los parámetros deseados
            Definir mesa2 como una nueva instancia de MesaDoble con los parámetros deseados
            Definir mesa3 como una nueva instancia de MesaGrupo con los parámetros deseados
            Agregar mesa1, mesa2 y mesa3 a la tabla de reservas
            Imprimir "Estas son las mesas que ofrecemos para reservar: "
            Llamar al método mostrarMesas() de tablaReservas
```


# Ejercicio 2: Guía Turística Multilingüe

Este proyecto implementa una guía turística multilingüe en Java.

## 1. Descripción del Código

### 1.1. Interfaz `Traduccion`

La interfaz `Traduccion` define un contrato para las clases que deseen actuar como traducciones en la guía turística. Contiene cuatro métodos abstractos:

- `introducirLugar()`: Muestra un mensaje de bienvenida al lugar turístico.
- `introducirHorario()`: Muestra el horario de operación del lugar turístico.
- `inicioRespuesta()`: Muestra un mensaje de inicio de respuesta.
- `finRespuesta()`: Muestra un mensaje de despedida.

### 1.2. Implementaciones de la Interfaz

Se proporcionan dos implementaciones de la interfaz `Traduccion`:

- `TraduccionEspaniol`: Implementa los métodos abstractos para mostrar mensajes en español.
- `TraduccionIngles`: Implementa los métodos abstractos para mostrar mensajes en inglés.

### 1.3. Clase Principal `GuiaTuristica`

La clase `GuiaTuristica` es la clase principal del programa. Contiene la lógica para que el usuario elija el idioma deseado y muestra la información sobre el lugar turístico en el idioma seleccionado.

1. Se importa la clase `Scanner` para tomar la entrada del usuario.
2. Se solicita al usuario que elija el idioma deseado (español o inglés) ingresando un número correspondiente.
3. Se instancia un objeto de la clase `TraduccionEspaniol` o `TraduccionIngles` según la opción seleccionada.
4. Se llaman a los métodos de la interfaz `Traduccion` en la instancia correspondiente para mostrar la información del lugar turístico en el idioma seleccionado.
5. Se cierra el objeto `Scanner`.

# Pseudocódigo

```java
Interfaz Traduccion {
    introducirLugar()
    introducirHorario()
    inicioRespuesta()
    finRespuesta()
}

Clase TraduccionEspaniol implementa Traduccion {
    introducirLugar() {
        Mostrar "Bienvenido a nuestro lugar turístico."
    }
    introducirHorario() {
        Mostrar "Nuestro horario es de 9:00 am a 6:00 pm."
    }
    inicioRespuesta() {
        Mostrar "Por favor, espere un momento..."
    }
    finRespuesta() {
        Mostrar "¡Gracias por su visita!"
    }
}

Clase TraduccionIngles implementa Traduccion {
    introducirLugar() {
        Mostrar "Welcome to our tourist spot."
    }
    introducirHorario() {
        Mostrar "Our operating hours are from 9:00 am to 6:00 pm."
    }
    inicioRespuesta() {
        Mostrar "Please wait a moment..."
    }
    finRespuesta() {
        Mostrar "Thank you for your visit!"
    }
}

Clase GuiaTuristica {
    Funcion principal() {
        Mostrar "Elija el idioma deseado (1: Español, 2: Inglés): "
        Leer opcion
        Si opcion == 1
            Crear instancia de TraduccionEspaniol
        Sino si opcion == 2
            Crear instancia de TraduccionIngles
        Sino
            Mostrar "Opción no válida, seleccionando Español por defecto."
            Crear instancia de TraduccionEspaniol
        Fin Si
        Llamar a inicioRespuesta()
        Llamar a introducirLugar()
        Llamar a introducirHorario()
        Llamar a finRespuesta()
    }
}

```
