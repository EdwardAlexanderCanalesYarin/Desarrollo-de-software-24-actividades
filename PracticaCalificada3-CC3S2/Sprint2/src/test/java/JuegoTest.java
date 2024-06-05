import org.example.Habitacion;
import org.example.Juego;
import org.example.Jugador;
import org.example.Objeto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JuegoTest {
    // TESTS Sprint 1
    // Crear habitaciones
    @Test
    public void CreacionDeHabitacionConExitoTest(){
        // Arrange
        int n_habitaciones = 5;
        Habitacion habitacion = new Habitacion(n_habitaciones);
        // Act
        int resultado = habitacion.getN_habitaciones();
        // Assert
        assertEquals(5, resultado, "Deberia ser 5");
    }
    @Test
    public void CreacionDeHabitacionSinExitoTest(){
        // Arrange
        int n_habitaciones = 0;
        Habitacion habitacion = new Habitacion(n_habitaciones);
        // Act y Assert
        assertThrows(ArithmeticException.class, ()->{
            habitacion.getN_habitaciones();
        });
    }
    // Movimiento del jugador
    @Test
    public void MovimientoDelJugadorValidoTest(){
        // Arrange
        int n_habitaciones = 5;
        Habitacion habitacion = new Habitacion(n_habitaciones);
        Jugador jugador = new Jugador();
        int mover_a_la_habitacion = 2;
        // Act
        jugador.setHabitacion_actual(mover_a_la_habitacion, n_habitaciones);
        int resultado = jugador.getHabitacion_actual();
        // Assert
        assertEquals(2, resultado, "Deberia estar en la habitacion 2");
    }
    @Test
    public void MovimientoDelJugadorInvalidoTest(){
        // Arrange
        int n_habitaciones = 5;
        Habitacion habitacion = new Habitacion(n_habitaciones);
        Jugador jugador = new Jugador();
        int mover_a_la_habitacion = 6;
        // Act y Assert
        assertThrows(ArithmeticException.class, ()->{
            jugador.setHabitacion_actual(mover_a_la_habitacion, n_habitaciones);
        });
    }
    // Inicializacion del juego
    @Test
    public void InicializacionDelJuegoTest(){
        // Arrange
        int n_habitaciones = 5;
        Habitacion habitacion = new Habitacion(n_habitaciones);
        Jugador jugador = new Jugador();
        int habitacion_inicial = 3;
        Juego juego = new Juego();
        // Act
        jugador.setHabitacion_actual(habitacion_inicial, n_habitaciones);
        int resultado = jugador.getHabitacion_actual();
        // Assert
        assertEquals(3, resultado, "Deberia iniciar el juego con el jugador en la habitacion 3");
    }
    // TESTS Sprint 2
    // Recogida de objetos
    @Test
    public void RecogeObjetoCantidadValidaTest(){
        // Arrange
        int n_objetos_recogidos = 3;
        Objeto objeto = new Objeto(n_objetos_recogidos);
        // Act
        int resultado = objeto.getN_Objetos_Recogidos();
        // Assert
        assertEquals(3, resultado, "Deberia haber recogido 3 objetos");
    }
    @Test
    public void RecogeObjetoCantidadInvalidaTest(){
        // Arrange
        int n_objetos_recogidos = -1;
        Objeto objeto = new Objeto(n_objetos_recogidos);
        // Act y Assert
        assertThrows(ArithmeticException.class, ()->{
            objeto.getN_Objetos_Recogidos();
        });
    }
    // Gestion de inventario
    @Test
    public void GestionDeInventarioRemoverObjetoTest(){
        // Arrange
        Objeto objeto_removido = new Objeto();
        Jugador jugador = new Jugador();
        // Act
        jugador.RemoverObjeto(objeto_removido);
        Objeto resultado = juador.UltimoObjetoRemovido();
        // Assert
        assertEquals(objeto_removido, resultado, "Deberia remorse objeto_removido");
    }
    @Test
    public void GestionDeInventarioAgregarObjetoTest(){
        // Arrange

    }
    // Mecanica de resolucion de acertijos
    @Test
    public void MecanicaDeResolucionDeAcertijosTest(){

    }
}
