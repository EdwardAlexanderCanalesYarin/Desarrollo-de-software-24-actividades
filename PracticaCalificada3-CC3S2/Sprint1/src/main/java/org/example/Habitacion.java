package org.example;

public class Habitacion {
    int n_habitaciones;
    public Habitacion(int n_habitaciones){
        this.n_habitaciones = n_habitaciones;
    }
    public int getN_habitaciones(){
        if (n_habitaciones == 0){
            throw new ArithmeticException("Ninguna habitacion");
        }
        return n_habitaciones;
    }
}
