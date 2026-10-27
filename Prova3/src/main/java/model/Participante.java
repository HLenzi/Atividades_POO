/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author Lenzi
 */
public abstract class Participante {
    private int idade;
    private String nome;

    
    public Participante(int idade, String nome) {
        this.setIdade(idade);
        this.setNome(nome);
    }
    
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(idade <= 0){
            throw new IllegalArgumentException("Idade invalida");
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.trim().isEmpty()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }
    
    public abstract float calcularDesempenho();
}
