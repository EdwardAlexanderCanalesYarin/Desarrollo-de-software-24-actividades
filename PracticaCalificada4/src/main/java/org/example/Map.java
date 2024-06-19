package org.example;

public class Map {
    private int size;
    public Map(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    public int[][] crearMapa(){
        int Mapa[][] = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                Mapa[i][j] = 0;
            }
        }
        return Mapa;
    }
    public int[][] inicializarMapa(){
        int MapaInicial[][] = crearMapa();
        int rdmB_x = (int)(Math.random()*size);
        int rdmB_y = (int)(Math.random()*size);
        int rdmC_y;
        for(int i = 0; i < size; i++){
            rdmC_y = (int)(Math.random()*size);
            for(int j = 0; j < size; j++){
                if(i == rdmB_x && j == rdmB_y && MapaInicial[i][j] == 0){
                    MapaInicial[i][j] = 2;
                } else if (j == rdmC_y && MapaInicial[i][j] == 0) {
                    MapaInicial[i][j] = 1;
                }
            }
        }
        mostrarMapa(MapaInicial);
        return MapaInicial;
    }
    public void mostrarMapa(int[][] mapa){
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(mapa[i][j] == 0){
                    System.out.print("| |");
                }else if(mapa[i][j] == 1){
                    System.out.print("|C|");
                }else{
                    System.out.print("|B|");
                }
            }
            System.out.println();
        }
    }
}
