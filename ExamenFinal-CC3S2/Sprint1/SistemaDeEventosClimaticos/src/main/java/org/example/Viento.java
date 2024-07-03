package org.example;

public class Viento {
    int velocidad_viento;
    public Viento(int velocidad_viento) {
        this.velocidad_viento = velocidad_viento;
    }

    public String VelocidadVientoMayorACuarenta() {
        if(velocidad_viento > 40){
            return "Alerta de viento fuerte";
        }else{
            return "";
        }
    }
}
