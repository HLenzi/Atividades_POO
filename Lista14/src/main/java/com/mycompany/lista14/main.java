/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lenzi
 */
public class main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String caminhoArquivo = "C:\\Users\\Lenzi\\Downloads\\L14_municipios.csv"; // Caminho do seu arquivo

        FileReader fr = new FileReader(caminhoArquivo);
        try (BufferedReader br = new BufferedReader(fr)) {

            String linha;
            linha = br.readLine();

            String nomeMaior = "";
            int maior = 0;
            String nomeMenor = "";
            int menor = Integer.MAX_VALUE;

            while ((linha = br.readLine()) != null) {
                String[] coluna = linha.split(";");

                int codigo = Integer.parseInt(coluna[0]);
                String nomeCidade = coluna[1];
                String estado = coluna[2];
                int populacao = Integer.parseInt(coluna[3]);

                Cidade cidade = new Cidade(codigo, nomeCidade, estado, populacao);

                if (cidade.getPopulacao() >= maior) {
                    maior = cidade.getPopulacao();
                    nomeMaior = cidade.getNome();
                }

                if (cidade.getPopulacao() <= menor) {
                    menor = cidade.getPopulacao();
                    nomeMenor = cidade.getNome();
                }
            }
            System.out.println("Menor: " + nomeMenor);
            System.out.println("Maior: " + nomeMaior);
        }
    }
}
