/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Lista4.Ex1;

import Lista4.Ex2.*;

/**
 *
 * @author hhlenzi
 */
public class Retangulo {

    private int altura;
    private int comprimento;

    public void setAltura(int altura){
        if (altura <= 0){
            throw new IllegalArgumentException("Altura invalido: "+altura);
        }
        this.altura = altura;
    }
    
    public int getAltura(int altura){
        return altura;
    }
    
    public int getComprimento(int comprimento){
        return comprimento;
    }
    
    public void setComprimento(int comprimento){
        if (comprimento <= 0){
            throw new IllegalArgumentException("Comprimento invalido: "+comprimento);
        }
        this.comprimento = comprimento;
    }
    
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
    
    public Retangulo(int altura, int comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
    }
    
    public int calcularPerimetro(){
        int perimetro = altura * 2 + comprimento * 2;
        return perimetro;
    }
    
    public int calcularArea(){
        int area = altura * comprimento;
        return area;
    }
}
