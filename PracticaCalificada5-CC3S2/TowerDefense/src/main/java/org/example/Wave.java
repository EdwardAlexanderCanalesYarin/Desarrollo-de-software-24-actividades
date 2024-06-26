package org.example;

import java.util.ArrayList;
import java.util.List;

public class Wave {
    private int numero_enemigos_x_oleada;
    public Wave(int x){
        this.numero_enemigos_x_oleada = x;
    }
    public int ataqueEnemigos(){
        System.out.println("Enemigos estan atacando ...");
        return numero_enemigos_x_oleada * 2;
    }
    public void start() {
        System.out.println("Oleada iniciada!");
    }
    public int getNumero_enemigos_x_oleada(){
        return numero_enemigos_x_oleada;
    }
}