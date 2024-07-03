package org.example;

public class Humedad {
    int cantidad_humedad;

    public Humedad(int cantidad_humedad) {
        this.cantidad_humedad = cantidad_humedad;
    }

    public String CantidadHumedadMayorAOchenta() {
        if(cantidad_humedad > 80){
            return "Humedad alta";
        }else{
            return "";
        }
    }
}
