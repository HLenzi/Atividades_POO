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
        Scanner tc = new Scanner (System.in);
        
        System.out.print("Nome do funcionario: ");
        String nome = tc.nextLine();
        
        System.out.print("Salario: ");
        Double salario = tc.nextDouble();
        
        Funcionario funcionario = new Funcionario(nome, salario);
        
        FaixaIrpf faixa = funcionario.identificarFaixaIrpf();
        double imposto = funcionario.calcylarIrpf(salario);
        
        System.out.println("Imposto: "+imposto);
        System.out.println("Faixa: "+ faixa);
    }
}
