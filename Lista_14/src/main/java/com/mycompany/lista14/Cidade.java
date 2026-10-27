/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista14;

/**
 *
 * @author Lenzi
 */
public class Cidade {
    private int codigo;
    private String nome;
    private String Estado;
    private int populacao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public Cidade(int codigo, String nome, String Estado, int populacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.Estado = Estado;
        this.populacao = populacao;
    }
    
    
}
