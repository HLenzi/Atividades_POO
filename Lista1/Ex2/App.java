/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex2;
import Ex1.*;
import java.util.Scanner;
/**
 *
 * @author hhlenzi
 */
public class App {
    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
    Pessoa pedro = new Pessoa();
    
        System.out.println("Altura: ");
        pedro.altura = tc.nextDouble();
        
        System.out.println("Peso: ");
        pedro.peso = tc.nextDouble();
        
        double imc = pedro.calcularImc();
        
        System.out.println("Imc: "+imc);
        
        
    }
    
    
    }
