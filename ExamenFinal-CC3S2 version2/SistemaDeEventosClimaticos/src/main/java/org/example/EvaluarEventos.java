package org.example;

public class EvaluarEventos {
    Viento viento;
    Lluvia lluvia;
    public EvaluarEventos(int velocidad_viento, int cantidad_lluvia) {
        this.viento = new Viento(velocidad_viento);
        this.lluvia = new Lluvia(cantidad_lluvia);
    }

    public boolean EventosSuperanSusUmbrales() {
        if(viento.velocidad_viento > 40 && lluvia.cantidad_lluvia > 15){
            return true;
        }else{
            return false;
        }
    }
}
