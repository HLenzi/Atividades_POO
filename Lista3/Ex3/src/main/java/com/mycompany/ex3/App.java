/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;
import java.util.Scanner;
/**
 *
 * @author hhlenzi
 */
public class App {
    private static Scanner tc = new Scanner(System.in);
    
    public static void main(String[] args){    
        Funcionario[] funcionarios = new Funcionario[2]; 
        
        for(int i = 0; i < funcionarios.length; i++){
            funcionarios [i] = criarFuncionario();
        }
        
        for(int i = 0; i < funcionarios.length; i++){
            exibirFuncionarioPane(funcionarios[i]);
        }
        
        
        tc.close();
    }
    public static void exibirFuncionarioPane(Funcionario funcionario){
        System.out.println( "Nome: " + funcionario.getNome()
                + " Salario: " + funcionario.getSalario()
                + " IRPF: " + funcionario.calcularIrpf());        
        
        }
    
    public static Funcionario criarFuncionario(){
        System.out.print("Nome do funcionario: ");
        String nome = tc.nextLine();
        
        System.out.print("Informe o salario do funcionario: ");
        double salario = tc.nextDouble();
    
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setSalario(salario);
        
        return funcionario;
    }
}
