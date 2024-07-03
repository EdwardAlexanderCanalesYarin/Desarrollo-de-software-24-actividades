package org.example;

public class Temperatura {
    int cantidad_calorifica;
    public void SetCantidadCalorifica(int cantidadCalorifica) {
        this.cantidad_calorifica = cantidadCalorifica;
    }

    public String CantidadCalorificaMayorATreinta() {
        if(cantidad_calorifica > 30){
            return "Activar sistema de riego";
        }else{
            return "";
        }
    }
}
