package org.example;

public class Jugador {
    int habitacion_actual;
    public int getHabitacion_actual() {
        return habitacion_actual;
    }
    public void setHabitacion_actual(int habitacion, int n_habitaciones){
        if (habitacion > n_habitaciones){
            throw new ArithmeticException("Excede la cantidad de habitaciones");
        }
        this.habitacion_actual = habitacion;
    }
    public void descripcion_de_la_habitacion(){
        System.out.println("Descripcion de la habitacion numero " + habitacion_actual);
    }
}
