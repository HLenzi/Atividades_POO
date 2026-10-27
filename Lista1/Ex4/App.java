/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4; 
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
        
        
        System.out.println("Nome: ");
        p1.nome = tc.nextLine();
        System.out.print("Altura: ");
        p1.altura = tc.nextDouble();
        System.out.print("Peso: ");
        p1.peso = tc.nextDouble();
        p1.imc = p1.calcularImc();
        
        
        System.out.println("Nome: ");
        p2.nome = tc.nextLine();
        System.out.print("Altura: ");
        p2.altura = tc.nextDouble();
        System.out.print("Peso: ");
        p2.peso = tc.nextDouble();
        p2.imc = p2.calcularImc();
        
        
        System.out.println("Nome: ");
        p3.nome = tc.nextLine();
        System.out.print("Altura: ");
        p3.altura = tc.nextDouble();
        System.out.print("Peso: ");
        p3.peso = tc.nextDouble();
        p3.imc = p3.calcularImc();
        
        
        System.out.println("Nome: "+p3.nome);
        System.out.println("Altura: "+p3.altura);
        System.out.println("Peso: "+p3.peso);
        System.out.println("Imc: "+p3.imc);
        System.out.println("");
        
        System.out.println("Nome: "+p2.nome);
        System.out.println("Altura: "+p2.altura);
        System.out.println("Peso: "+p2.peso);
        System.out.println("Imc: "+p2.imc);
        System.out.println("");
        
        System.out.println("Nome: "+p1.nome);
        System.out.println("Altura: "+p1.altura);
        System.out.println("Peso: "+p1.peso);
        System.out.println("Imc: "+p1.imc);
        
    
    }
    
}
