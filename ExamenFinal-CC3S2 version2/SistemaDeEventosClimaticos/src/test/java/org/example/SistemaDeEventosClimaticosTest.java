package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SistemaDeEventosClimaticosTest {
    // Alertas (Alerta de Lluvia Intensa, Alerta de Viento Fuerte) tests
    @Test
    public void MostrarAlertaLluviaIntensaSiCantidadDeLluviaEsMayorAQuinceTest(){
        // Arrange
        int cantidad_lluvia = 20;
        Lluvia lluvia = new Lluvia(cantidad_lluvia);
        // Act
        boolean resultado = lluvia.CantidadLluviaMayorAQuince();
        // Assert
        assertEquals(true, resultado, "Deberia devolver verdadero");
    }
    @Test
    public void NoMostrarAlertaLluviaIntensaSiCantidadDeLluviaEsMenorAQuinceTest(){
        // Arrange
        int cantidad_lluvia = 10;
        Lluvia lluvia = new Lluvia(cantidad_lluvia);
        // Act
        boolean resultado = lluvia.CantidadLluviaMayorAQuince();
        // Assert
        assertEquals(false, resultado, "Deberia devolver falso");
    }
    @Test
    public void MostrarAlertaVientoFuerteSiVelocidadDelVientoEsMayorACuarentaTest(){
        // Arrange
        int velocidad_viento = 45;
        Viento viento = new Viento(velocidad_viento);
        // Act
        boolean resultado = viento.VelocidadVientoMayorACuarenta();
        // Assert
        assertEquals(true, resultado, "Deberia devolver true");
    }
    @Test
    public void NoMostrarAlertaVientoFuerteSiVelocidadDelVientoEsMenorACuarentaTest(){
        // Arrange
        int velocidad_viento = 30;
        Viento viento = new Viento(velocidad_viento);
        // Act
        boolean resultado = viento.VelocidadVientoMayorACuarenta();
        // Assert
        assertEquals(false, resultado, "Deberia devolver false");
    }
    // Acciones automáticas (Activar Sistema de Riego, Cerrar Persianas) tests
    @Test
    public void ActivarSistemaDeRiegoSiTemperaturaEsMayorATreintaTest(){
        // Arrange
        int cantidad_calorifica = 32;
        Temperatura temperatura = new Temperatura(cantidad_calorifica);
        // Act
        boolean resultado = temperatura.CantidadCalorificaMayorATreinta();
        // Assert
        assertEquals(true, resultado, "Deberia devolver true");
    }
    @Test
    public void NoActivarSistemaDeRiegoSiTemperaturaEsMenorATreintaTest(){
        // Arrange
        int cantidad_calorifica = 25;
        Temperatura temperatura = new Temperatura(cantidad_calorifica);
        // Act
        boolean resultado = temperatura.CantidadCalorificaMayorATreinta();
        // Assert
        assertEquals(false, resultado, "Deberia devolver false");
    }
    @Test
    public void CerrarPersianasSiVelocidadDelVientoEsMayorACuarentaYCantidadDeLluviaEsMayorAQuinceTest(){
        // Arrange
        int velocidad_viento = 42;
        Viento viento = new Viento(velocidad_viento);
        int cantidad_lluvia = 17;
        Lluvia lluvia = new Lluvia(cantidad_lluvia);
        EvaluarEventos evaluarEventos = new EvaluarEventos(velocidad_viento, cantidad_lluvia);
        // Act
        boolean resultado = evaluarEventos.EventosSuperanSusUmbrales();
        // Assert
        assertEquals(true, resultado, "Deberia devolver true");
    }
    @Test
    public void NoCerrarPersianasSiVelocidadDelVientoEsMenorACuarentaYCantidadDeLluviaEsMenorAQuinceTest(){
        // Arrange
        int velocidad_viento = 28;
        Viento viento = new Viento(velocidad_viento);
        int cantidad_lluvia = 10;
        Lluvia lluvia = new Lluvia(cantidad_lluvia);
        EvaluarEventos evaluarEventos = new EvaluarEventos(velocidad_viento, cantidad_lluvia);
        // Act
        boolean resultado = evaluarEventos.EventosSuperanSusUmbrales();
        // Assert
        assertEquals(false, resultado, "Deberia devolver false");
    }
    // Notificaciones (Enviar Notificación a Usuarios) tests
    @Test
    public void EnviarNotificacionSiHumedadEsMayorAOchentaTest(){
        // Arrange
        int cantidad_humedad = 87;
        Humedad humedad = new Humedad(cantidad_humedad);
        // Act
        boolean resultado = humedad.CantidadHumedadMayorAOchenta();
        // Assert
        assertEquals(true, resultado, "Deberia devolver true");
    }
    @Test
    public void NoEnviarNotificacionSiHumedadEsMenorAOchentaTest(){
        // Arrange
        int cantidad_humedad = 75;
        Humedad humedad = new Humedad(cantidad_humedad);
        // Act
        boolean resultado = humedad.CantidadHumedadMayorAOchenta();
        // Assert
        assertEquals(false, resultado, "Deberia devolver false");
    }
    @Test
    public void EnviarNotificacionSiPresionAtmosfericaEsMayorACienTest(){
        //  Arrange
        int cantidad_presion = 120;
        PresionAtmosferica presionAtmosferica = new PresionAtmosferica(cantidad_presion);
        // Act
        boolean resultado = presionAtmosferica.CantidadPresionMayorACien();
        // Assert
        assertEquals(true, resultado, "Deberia devolver true");
    }
    @Test
    public void NoEnviarNotificacionSiPresionAtmosfericaEsMenorrACienTest(){
        //  Arrange
        int cantidad_presion = 80;
        PresionAtmosferica presionAtmosferica = new PresionAtmosferica(cantidad_presion);
        // Act
        boolean resultado = presionAtmosferica.CantidadPresionMayorACien();
        // Assert
        assertEquals(false, resultado, "Deberia devolver false");
    }
}
