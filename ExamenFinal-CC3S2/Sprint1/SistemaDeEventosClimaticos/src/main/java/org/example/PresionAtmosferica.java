package org.example;

public class PresionAtmosferica {
    int cantidad_presion;

    public PresionAtmosferica(int cantidad_presion) {
        this.cantidad_presion = cantidad_presion;
    }

    public String CantidadPresionMayorACien() {
        if(cantidad_presion > 100){
            return "Presion atmosferica alta";
        }else{
            return "";
        }
    }
}
