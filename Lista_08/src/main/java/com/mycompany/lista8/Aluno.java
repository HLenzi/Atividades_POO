/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista8;

/**
 *
 * @author Lenzi
 */
public class Aluno {

    private int matricula;
    private String nome;
    private double notaEnem;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim() . isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        
        this.nome = nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }
    
    public Aluno(String nome, int matricula, double notaEnem){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNotaEnem(notaEnem);
    }
    
    
}
