/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7a.model;

/**
 *
 * @author Lenzi
 */
public class Imovel {
    private String endereco;
    private int area;
    private Bairro bairro;
    private Finalidade finalidade;

    
    public double calcularIptu(){
        setArea(area);
        setBairro(bairro);
        setFinalidade(finalidade);
        setEndereco(endereco);
        
        switch(finalidade){
            case RESIDENCIAL:
                return calcularResidencial();
                
            case COMERCIAL:
                return calcularComercial();
                
            case INDUSTRIAL:
                return calcularIndustrial();
                
            default:
                return 0;
        }
    }
    
    private double calcularResidencial(){
        return area * bairro.getCoeficienteIptu();
    }
    
    private double calcularComercial(){
        if(area <= 100){
            return 500 * bairro.getCoeficienteIptu();
        }
        if(area <= 400){
            return 1000 * bairro.getCoeficienteIptu();
        }
        
        return (area*2.55) * bairro.getCoeficienteIptu();
    }
    
    private double calcularIndustrial(){
        if(area <= 2000){
            return 1000;
        }
        
        return 0.55 * bairro.getCoeficienteIptu() * area;
    }
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco.trim() .isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.endereco = endereco;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area <= 0){
            throw new IllegalArgumentException("Area invalida");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        if (bairro == null){
            throw new IllegalArgumentException("bairro invalido");
        }
        this.bairro = bairro;
    }

    public Finalidade getFinalidade() {
        if (finalidade == null){
            throw new IllegalArgumentException("Finalidade invalido");
        }
        return finalidade;
    }

    public void setFinalidade(Finalidade finalidade) {
        this.finalidade = finalidade;
    }
    
    
}
