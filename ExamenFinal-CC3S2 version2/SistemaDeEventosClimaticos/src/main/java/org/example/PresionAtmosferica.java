package org.example;

public class PresionAtmosferica {
    int cantidad_presion;

    public PresionAtmosferica(int cantidad_presion) {
        this.cantidad_presion = cantidad_presion;
    }

    public boolean CantidadPresionMayorACien() {
        if(cantidad_presion > 100){
            return true;
        }else{
            return false;
        }
    }
}
