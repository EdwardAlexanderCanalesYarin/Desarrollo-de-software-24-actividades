package org.example;

public class Game {
    public static void main(String[] args) {
        // Inicialización:
        Game game = new Game();
        Map mapa = new Map(5);
        int [][] estado_del_mapa = mapa.inicializarMapa();
        Player player = new Player();
        Wave wave = new Wave(6);
        int nro_oleada = 1;
        // Flujo del juego
        while (player.getBaseHealth() != 0){
            wave.iniciaOleada(nro_oleada);
            game.estadoDelJuego(mapa, player, estado_del_mapa);
            nro_oleada += 1;
        }
        System.out.println("EL JUEGO HA TERMINADO");
    }
    public void estadoDelJuego(Map mapa, Player player, int[][] map){
        System.out.println("Estado del juego: \nMapa");
        mapa.mostrarMapa(map);
        System.out.println("Puntuación: " + player.getScore());
        System.out.println("Vida de la base: " + player.getBaseHealth());
    }
}