/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;
import java.util.Scanner;
/**
 *
 * @author hhlenzi
 */
public class App {
        public static void main(String[] args) {
         Scanner tc = new Scanner(System.in);
         
         System.out.println("Ponto 1");
         System.out.print("X: ");
         int x1 = tc.nextInt();
         
         System.out.print("Y: ");
         int y1 = tc.nextInt();
         
         Ponto p1 = new Ponto(x1, y1);
         
         System.out.println("Ponto 2");
         System.out.print("X: ");
         int x2 = tc.nextInt();
         
         
         System.out.print("Y: ");
         int y2 = tc.nextInt();
         
         Ponto p2 = new Ponto(x2, y2);
         
         Quadrante quadrante1 = p1.identificarQuadrante();
         Quadrante quadrante2 = p2.identificarQuadrante();
        
         double distancia = p1.calcularDistancia(p1, p2);
        
         System.out.println("O ponto 1 está no quadrante "+quadrante1);
         System.out.println("O ponto 2 está no quadrante "+quadrante2);
         System.out.println("A distancia dos pontos é "+distancia);
        }
}