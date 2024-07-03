package org.example;

public class Humedad {
    int cantidad_humedad;

    public Humedad(int cantidad_humedad) {
        this.cantidad_humedad = cantidad_humedad;
    }

    public boolean CantidadHumedadMayorAOchenta() {
        if(cantidad_humedad > 80){
            return true;
        }else{
            return false;
        }
    }
}
