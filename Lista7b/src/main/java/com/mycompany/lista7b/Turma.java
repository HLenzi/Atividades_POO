/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista7b;

/**
 *
 * @author Lenzi
 */
public class Turma {
    private String disciplina;
    private String professor;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina.trim() .isEmpty()){
            throw new IllegalArgumentException("Displina invalida");
        }
        this.disciplina = disciplina;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        if (professor.trim() .isEmpty()){
            throw new IllegalArgumentException("Professor invalido");
        }
        this.professor = professor;
    }
    
    public Turma(String disciplina, String professor){
        this.disciplina = disciplina;
        this.professor = professor;
    }
    
    
}
