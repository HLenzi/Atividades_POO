/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex4;


/**
 *
 * @author hhlenzi
 */
public class Pessoa {
        String nome;
        double altura;
        double peso;
        double imc;
        
        double calcularImc(){
        imc = peso/(altura* altura);
        return imc;
        }
}
