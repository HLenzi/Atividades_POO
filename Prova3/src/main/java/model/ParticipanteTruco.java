/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenzi
 */
public class ParticipanteTruco extends Participante {
    private double blefe;
    private double ponto;
    private double manilha;

    public ParticipanteTruco(int idade, String nome, double blefe, double ponto, double manilha) {
        super(idade, nome);
        this.blefe = blefe;
        this.ponto = ponto;
        this.manilha = manilha;
    }
    


    @Override
    public float calcularDesempenho() {
    float pontosFinal = 0;
    
    pontosFinal = (float) (ponto + (blefe * 4));
    
    return pontosFinal;
    }
}
