/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista7b;

/**
 *
 * @author Lenzi
 */
public class Aluno {

    private String nome;
    private int codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.trim() .isEmpty()){
            throw new IllegalArgumentException("Preencha o nome");
        }
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public Aluno (String nome,int codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0){
            throw new IllegalArgumentException("Codigo invalido");
        }
        this.codigo = codigo;
    }
    
}
