/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex3;
import java.util.Scanner;
/**
 *
 * @author hhlenzi
 */
public class App {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.print("Altura da primeira pessoa: ");
        p1.altura = tc.nextDouble();
        System.out.print("Peso da primeira pessoa: ");
        p1.peso = tc.nextDouble();
        double imc = p1.calcularImc();
        System.out.println("Imc: "+imc);
        
        
        System.out.print("Altura da segunda pessoa: ");
        p2.altura = tc.nextDouble();
        System.out.print("Peso da segunda pessoa: ");
        p2.peso = tc.nextDouble();
        imc = p2.calcularImc();
        System.out.println("Imc: "+imc);
        
        
        System.out.print("Altura da terceira pessoa: ");
        p3.altura = tc.nextDouble();
        System.out.print("Peso da terceira pessoa: ");
        p3.peso = tc.nextDouble();
        imc = p3.calcularImc();
        System.out.println("Imc: "+imc);
    
    }
    
}
