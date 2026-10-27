/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenzi
 */
public class ImportadorParticipante {

    private ArrayList<Participante> participantes = new ArrayList();

    public ImportadorParticipante(String caminho) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(caminho));
            String linha;
            
            while ((linha = br.readLine()) != null){
                String[] colunas = linha.split(",");
                
                if("T".equals(colunas[0])){
                    String nome = colunas[1];
                    int idade = Integer.parseInt(colunas[2]);
                    double blefe = Double.parseDouble(colunas[3]);
                    double ponto = Double.parseDouble(colunas[4]);
                    double manilha = Double.parseDouble(colunas[5]);
                    
                    ParticipanteTruco participante = new ParticipanteTruco(idade, nome, blefe, ponto, manilha);
                    this.participantes.add(participante);
                }
                
                if("S".equals(colunas[0])){
                    String nome = colunas[1];
                    int idade = Integer.parseInt(colunas[2]);
                    int penalidade = Integer.parseInt(colunas[3]);
                    int encacapadas = Integer.parseInt(colunas[4]);
                   
                    ParticipanteSinuca participante = new ParticipanteSinuca(idade, nome, penalidade, encacapadas);
                    this.participantes.add(participante);
                }
            }
                        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportadorParticipante.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportadorParticipante.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList getParticipantes() {
        return this.participantes;
    }

    public Participante getParticipanteMaisJovem() {
        int menorIdade = Integer.MAX_VALUE;
        Participante participanteNovo = participantes.get(1);

        for (Participante participante : participantes) {
            if (participante.getIdade() <= menorIdade) {
                participanteNovo = participante;
                menorIdade = participante.getIdade();
            }
        }
        return participanteNovo;
    }

    public Participante getParticipanteMaiorPonto() {
        float maiorPontuacao = Integer.MIN_VALUE;
        Participante participantePonto = null;

        for (Participante participante : participantes) {
            if (participante.calcularDesempenho() >= maiorPontuacao) {
                participantePonto = participante;
                maiorPontuacao = participante.calcularDesempenho();
            }
        }
        return participantePonto;
    }
}
