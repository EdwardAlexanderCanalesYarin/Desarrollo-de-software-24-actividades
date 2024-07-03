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
        String resultado = lluvia.CantidadLluviaMayorAQuince();
        // Assert
        assertEquals("Alerta de lluvia intensa", resultado, "Deberia mostrar alerta");
    }
    @Test
    public void NoMostrarAlertaLluviaIntensaSiCantidadDeLluviaEsMenorAQuinceTest(){
        // Arrange
        int cantidad_lluvia = 10;
        Lluvia lluvia = new Lluvia(cantidad_lluvia);
        // Act
        String resultado = lluvia.CantidadLluviaMayorAQuince();
        // Assert
        assertEquals("", resultado, "No Deberia mostrar alerta");
    }
    @Test
    public void MostrarAlertaVientoFuerteSiVelocidadDelVientoEsMayorACuarentaTest(){
        // Arrange
        int velocidad_viento = 45;
        Viento viento = new Viento(velocidad_viento);
        // Act
        String resultado = viento.VelocidadVientoMayorACuarenta();
        // Assert
        assertEquals("Alerta de viento fuerte", resultado, "Deberia mostrar alerta");
    }
    @Test
    public void NoMostrarAlertaVientoFuerteSiVelocidadDelVientoEsMenorACuarentaTest(){
        // Arrange
        int velocidad_viento = 30;
        Viento viento = new Viento(velocidad_viento);
        // Act
        String resultado = viento.VelocidadVientoMayorACuarenta();
        // Assert
        assertEquals("", resultado, "No deberia mostrar alerta");
    }
    // Acciones automáticas (Activar Sistema de Riego, Cerrar Persianas) tests
    @Test
    public void ActivarSistemaDeRiegoSiTemperaturaEsMayorATreintaTest(){
        // Arrange
        Temperatura temperatura = new Temperatura();
        int cantidad_calorifica = 32;
        // Act
        temperatura.SetCantidadCalorifica(cantidad_calorifica);
        String resultado = temperatura.CantidadCalorificaMayorATreinta();
        // Assert
        assertEquals("Activar sistema de riego", resultado, "Deberia activar sistema");
    }
    @Test
    public void NoActivarSistemaDeRiegoSiTemperaturaEsMenorATreintaTest(){
        // Arrange
        Temperatura temperatura = new Temperatura();
        int cantidad_calorifica = 25;
        // Act
        temperatura.SetCantidadCalorifica(cantidad_calorifica);
        String resultado = temperatura.CantidadCalorificaMayorATreinta();
        // Assert
        assertEquals("", resultado, "No deberia activar sistema");
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
        String resultado = evaluarEventos.EventosSuperanSusUmbrales();
        // Assert
        assertEquals("Cerrar persianas", resultado, "Deberia cerrar persianas");
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
        String resultado = evaluarEventos.EventosSuperanSusUmbrales();
        // Assert
        assertEquals("", resultado, "No deberia cerrar persianas");
    }
    // Notificaciones (Enviar Notificación a Usuarios) tests
    @Test
    public void EnviarNotificacionSiHumedadEsMayorAOchentaTest(){
        // Arrange
        int cantidad_humedad = 87;
        Humedad humedad = new Humedad(cantidad_humedad);
        // Act
        String resultado = humedad.CantidadHumedadMayorAOchenta();
        // Assert
        assertEquals("Humedad alta", resultado, "Deberia enviar notificacion");
    }
    @Test
    public void NoEnviarNotificacionSiHumedadEsMenorAOchentaTest(){
        // Arrange
        int cantidad_humedad = 75;
        Humedad humedad = new Humedad(cantidad_humedad);
        // Act
        String resultado = humedad.CantidadHumedadMayorAOchenta();
        // Assert
        assertEquals("", resultado, "No deberia enviar notificacion");
    }
    @Test
    public void EnviarNotificacionSiPresionAtmosfericaEsMayorACienTest(){
        //  Arrange
        int cantidad_presion = 120;
        PresionAtmosferica presionAtmosferica = new PresionAtmosferica(cantidad_presion);
        // Act
        String resultado = presionAtmosferica.CantidadPresionMayorACien();
        // Assert
        assertEquals("Presion atmosferica alta", resultado, "Deberia enviar notificacion");
    }
    @Test
    public void NoEnviarNotificacionSiPresionAtmosfericaEsMenorrACienTest(){
        //  Arrange
        int cantidad_presion = 80;
        PresionAtmosferica presionAtmosferica = new PresionAtmosferica(cantidad_presion);
        // Act
        String resultado = presionAtmosferica.CantidadPresionMayorACien();
        // Assert
        assertEquals("", resultado, "No deberia enviar notificacion");
    }
}
