package org.example;

public class CannonTower extends Tower {
    public CannonTower() {
        super(50, 2, 3); // daño, alcance, velocidad de disparo
    }
    public void mostrarPosicion(int x, int y){
        System.out.println("Torre Cannon colocada en (" + x + ", " + y + ")");
    }
}