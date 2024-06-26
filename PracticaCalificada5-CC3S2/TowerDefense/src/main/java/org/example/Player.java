package org.example;

public class Player {
    private int score;
    private int baseHealth;
    public Player(int score, int baseHealth) {
        this.score = score;
        this.baseHealth = baseHealth;
    }
    public int getScore() {
        return score;
    }
    public int getBaseHealth() {
        return baseHealth;
    }
    public void disminuyeBaseHealth(int x){
        baseHealth = baseHealth - x;
    }
    public void aumentaScore(int x){
        score = score + x;
    }
    public void ataquePlayer(int n_enemigos_eliminados){
        System.out.println("Player esta atacando ...");
        aumentaScore(n_enemigos_eliminados);
    }
}
