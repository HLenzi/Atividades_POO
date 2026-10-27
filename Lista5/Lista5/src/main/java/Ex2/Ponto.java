/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ex2;

import Ex1.*;

/**
 *
 * @author hhlenzi
 */
public class Ponto {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Ponto(int x, int y){
        this.x = 0;
        this.y = 0;
        setX(x);
        setY(y);
    }

    public Quadrante identificarQuadrante(){
        if( x == 0 || y == 0){
         return Quadrante.NENHUM;
        } else if( x > 0 && y > 0){
            return Quadrante.PRIMEIRO;
        } else if (x < 0 && y > 0) {
            return Quadrante.SEGUNDO;
        } else if (x < 0 && y < 0){
            return Quadrante.TERCEIRO;
        } else {
            return Quadrante.QUARTO;
        }
    }

    public boolean estaIndicadoSobreX (){
       if (x == 0){
            return true;
        } else {
            return false;
        }
}
    
    public boolean estaIndicadoSobreY (){
       if (y == 0){
            return true;
        } else {
            return false;
        }
}
    public double calcularDistancia(Ponto p1, Ponto p2){
        double distancia = 0;
        distancia = Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2);
        return Math.sqrt(distancia);
    }
    
}