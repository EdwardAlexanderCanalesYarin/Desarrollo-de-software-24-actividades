package org.example;

public class Juego {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion(5);
        Jugador jugador = new Jugador();
        jugador.setHabitacion_actual(4,5);
        jugador.descripcion_de_la_habitacion();
        // Cambiamos de habitacion
        jugador.setHabitacion_actual(1,5);
        jugador.descripcion_de_la_habitacion();
    }
}
