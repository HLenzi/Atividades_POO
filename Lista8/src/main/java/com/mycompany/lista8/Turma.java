/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista8;
import java.util.ArrayList;

/**
 *
 * @author Lenzi
 */
public class Turma {
    private String disciplina;
    private Professor professor;
    private Enum Turno;
    private Aluno aluno;
    protected ArrayList<Aluno> turma = new ArrayList<>();

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        if (disciplina.trim() . isEmpty()){
            throw new IllegalArgumentException("Disciplina invalido");
        }
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Enum getTurno() {
        return Turno;
    }

    public void setTurno(Enum Turno) {
        this.Turno = Turno;
    }

    public ArrayList<Aluno> getTurma() {
        return turma;
    }
   
    public void incluirAluno(Aluno aluno){
        turma.add(aluno);
    }
    
    public void removerAluno(Aluno aluno){
        turma.remove(aluno);
    }
    
    public Aluno melhorNotaEnem(){
        if(turma.isEmpty()){
            return null;
        }
        Aluno melhorNota = turma.get(0);
        for(int i = 0; i < turma.size(); i++){
            if(turma.get(i).getNotaEnem() > melhorNota.getNotaEnem()){
                melhorNota = aluno;
            }
        }
        
        
        return melhorNota;
    }
}
