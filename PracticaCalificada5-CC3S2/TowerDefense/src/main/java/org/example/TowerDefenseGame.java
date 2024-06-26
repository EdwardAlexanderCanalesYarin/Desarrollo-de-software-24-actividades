package org.example;

import java.util.*;
public class TowerDefenseGame {
    private Map map;
    private Player player;
    private List<Wave> waves;
    public TowerDefenseGame() {
        this.map = new Map();
        this.player = new Player(0, 100);
        this.waves = new ArrayList<>();
    }
    public void placeTower(Tower tower, int x, int y) {
        map.placeTower(tower, x, y);
    }
    public void startWave(int num_enemigos) {
        Wave wave = new Wave(num_enemigos);
        waves.add(wave);
        wave.start();}
    public void gameState() {
        System.out.println(map);
        System.out.println("Puntuación: " + player.getScore());
        System.out.println("Vida de la base: " + player.getBaseHealth());
    }
    public Player getPlayer(){
        return player;
    }
    public static void main(String[] args){
        TowerDefenseGame towerDefenseGame = new TowerDefenseGame();
        towerDefenseGame.placeTower(new Tower('B'),1,0);
        towerDefenseGame.gameState();
        towerDefenseGame.startWave(5);
        while(towerDefenseGame.getPlayer().getBaseHealth() > 0){
            for(Wave wave: towerDefenseGame.waves){
                towerDefenseGame.getPlayer().ataquePlayer(wave.getNumero_enemigos_x_oleada());
                towerDefenseGame.getPlayer().disminuyeBaseHealth(wave.ataqueEnemigos());
                towerDefenseGame.gameState();
            }
        }
    }
}