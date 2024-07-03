package org.example;

public class Lluvia {
    int cantidad_lluvia;

    public Lluvia(int cantidad_lluvia) {
        this.cantidad_lluvia = cantidad_lluvia;
    }

    public String CantidadLluviaMayorAQuince() {
        if(cantidad_lluvia > 15){
            return "Alerta de lluvia intensa";
        }else{
            return "";
        }
    }
}
