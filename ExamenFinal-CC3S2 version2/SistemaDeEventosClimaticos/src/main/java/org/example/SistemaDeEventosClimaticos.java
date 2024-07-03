package org.example;

public class SistemaDeEventosClimaticos {
    public static void main(String[] args) {
        Temperatura temperatura = new Temperatura(32);
        Viento viento = new Viento(45);
        Lluvia lluvia = new Lluvia(18);
        Humedad humedad = new Humedad(87);
        PresionAtmosferica presionAtmosferica = new PresionAtmosferica(120);
        EvaluarEventos evaluarEventos = new EvaluarEventos(45,20);
        // REFACTORIZANDO EL FLUJO Y LOS METODOS DE LAS CLASES PARA QUE DEVUELVAN UN VALOR BOOLEANO
        /*
        // Comparaciones de una sola clase
        System.out.println(temperatura.CantidadCalorificaMayorATreinta());
        System.out.println(viento.VelocidadVientoMayorACuarenta());
        System.out.println(lluvia.CantidadLluviaMayorAQuince());
        System.out.println(humedad.CantidadHumedadMayorAOchenta());
        System.out.println(presionAtmosferica.CantidadPresionMayorACien());

        // Comparaciones entre dos clases (Viento y Lluvia)
        EvaluarEventos evaluarEventos = new EvaluarEventos(45,20);
        System.out.println(evaluarEventos.EventosSuperanSusUmbrales());
        */

        // Comparaciones de una sola clase
        if(temperatura.CantidadCalorificaMayorATreinta()){
            System.out.println("La temperatura excede a 30 grados celsius: Activar sistema de riego!");
        }else{
            System.out.println("La temperatura no excede a 30 grados celsius");
        }

        if(viento.VelocidadVientoMayorACuarenta()){
            System.out.println("La velocidad de viento excede a 40km/h: Alerta de viento fuerte!");
        }else{
            System.out.println("La velocidad de viento no excede a 40km/h");
        }

        if(lluvia.CantidadLluviaMayorAQuince()){
            System.out.println("La cantidad de lluvia excede a 15 mm: Alerta de lluvia intensa!");
        }else{
            System.out.println("La velocidad de viento no excede a 15 mm");
        }

        if(humedad.CantidadHumedadMayorAOchenta()){
            System.out.println("La cantidad de humedad excede a 80: Humedad alta!");
        }else{
            System.out.println("La cantidad de humedad no excede a 80");
        }

        if(presionAtmosferica.CantidadPresionMayorACien()){
            System.out.println("La cantidad de presion excede a 100: Presion alta!");
        }else{
            System.out.println("La cantidad de presion no excede a 100");
        }

        // Comparaciones entre dos clases (Viento y Lluvia)
        if(evaluarEventos.EventosSuperanSusUmbrales()){
            System.out.println("Vel. viento > 40km/h, cant. lluvia > 15mm: Activar sistema de riego!");
        }else{
            System.out.println("No se cumple: Vel. viento > 40km/h, cant. lluvia > 15mm");
        }
    }
}