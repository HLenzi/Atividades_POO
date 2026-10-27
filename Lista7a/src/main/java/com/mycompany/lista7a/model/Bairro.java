/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7a.model;

/**
 *
 * @author Lenzi
 */
public class Bairro {
    private String nome;
    private double coeficienteIptu;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim() .isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(double coeficienteIptu) {
        if (coeficienteIptu <= 0){
            throw new IllegalArgumentException("Coeficiente Iptu invalido");
        }
        this.coeficienteIptu = coeficienteIptu;
    }
    
    public Bairro(String nome, double coeficienteIptu){
        setNome(nome);
        setCoeficienteIptu(coeficienteIptu);
    }
    
}
