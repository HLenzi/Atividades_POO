/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;
import java.util.Scanner;
/**
 *
 * @author hhlenzi
 */
public class App {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Consumidor consumidor;
        
        System.out.print("Titular: ");
        String titular = tc.nextLine();
        
        System.out.println("Tipo de consumidor: ");
        System.out.println("1 - RESIDENCIAL");
        System.out.println("2 - COMERCIAL");
        System.out.println("3 - INDUSTRIAL");
        int tipoConsumidor = tc.nextInt();
        
        switch (tipoConsumidor) {
            case 1:
                consumidor = Consumidor.RESIDENCIAL;
                break;
            case 2:
                consumidor = Consumidor.COMERCIAL;
                break;
            case 3:
                consumidor = Consumidor.INDUSTRIAL;
                break;
            default:
                consumidor = null;
                break;
        }
        
        System.out.print("kWh consumidos no mes: ");
        int kWhMes = tc.nextInt();
        
        FaturaEletrica faturaEletrica = new FaturaEletrica(titular, consumidor, kWhMes);
        double fatura = faturaEletrica.calcularFatura();
        
        
        System.out.println("Titular: "+ faturaEletrica.getTitular());
        System.out.println("Fatura: "+ fatura);
        }
}
