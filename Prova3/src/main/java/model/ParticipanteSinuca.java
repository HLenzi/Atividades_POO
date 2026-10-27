/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenzi
 */
public class ParticipanteSinuca extends Participante {
    private int penalidade;
    private int encacapadas;

    public ParticipanteSinuca(int idade, String nome, int penalidade, int encacapadas) {
        super(idade, nome);
        this.penalidade = penalidade;
        this.encacapadas = encacapadas;
    }
    
    @Override
    public float calcularDesempenho() {
    float pontosFinal = 0;
    
    pontosFinal = (float) (encacapadas / penalidade);
    
    return pontosFinal;
    }
}
