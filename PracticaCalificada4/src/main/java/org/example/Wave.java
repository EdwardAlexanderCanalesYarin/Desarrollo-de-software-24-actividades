package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wave {
    private
    List<Enemy> enemies;
    private int waveNumber;
    public Wave(int waveNumber) {
        this.waveNumber = waveNumber;
        this.enemies = generateEnemies(waveNumber);
    }
    private List<Enemy> generateEnemies(int waveNumber) {
        enemies = new ArrayList<>();
        for (int i = 0; i < waveNumber * 5; i++) { // más enemigos cada oleada
            enemies.add(new BasicEnemy());
        }
        if (waveNumber % 5 == 0) { // jefe cada 5 oleadas
            enemies.add(new BossEnemy());
        }
        return enemies;
    }
    // Métodos para manejar el progreso de la oleada
    public int getWaveNumber() {
        return waveNumber;
    }
    public void iniciaOleada(int nro_oleada){
        System.out.println("Oleada " + nro_oleada +" iniciada");
        System.out.println("Enemigos en camino...");
    }
}
