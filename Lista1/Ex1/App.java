/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;
/**
 *
 * @author hhlenzi
 */
public class App {
    public static void main(String[] args) {
    Pessoa pedro = new Pessoa();
    
        pedro.altura = 1.75;
        pedro.peso = 78;
        
        double imc = pedro.calcularImc();
        
        System.out.println("Imc: "+imc);
        
        
    }
    
    
    }
