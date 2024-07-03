package org.example;

public class Temperatura {
    int cantidad_calorifica;

    // REFACTORIZANDO, reemplazo el metodo SetCantidadCalorifica() por el constructor
    /*
    public void SetCantidadCalorifica(int cantidadCalorifica) {
        this.cantidad_calorifica = cantidadCalorifica;
    }
    */
    public Temperatura(int cantidad_calorifica) {
        this.cantidad_calorifica = cantidad_calorifica;
    }

    public boolean CantidadCalorificaMayorATreinta() {
        if(cantidad_calorifica > 30){
            return true;
        }else{
            return false;
        }
    }
}
