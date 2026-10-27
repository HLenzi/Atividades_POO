/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista14;

/**
 *
 * @author Lenzi
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorCSV {

    private String nomeMaior;
    private String nomeMenor;

    public static void main(String[] args) {
        String caminhoArquivo = "C:\\Users\\Lenzi\\Downloads\\L14_municipios.csv"; // Caminho do seu arquivo

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;

            // Lê o cabeçalho e ignora
            linha = br.readLine();
            String nomeMaior = "";
            int maior = 0;
            String nomeMenor = "";
            int menor = Integer.MAX_VALUE;
            // Lê o restante das linhas
            while ((linha = br.readLine()) != null) {
                // Divide a linha em colunas usando o ponto e vírgula como delimitador
                String[] colunas = linha.split(";");

                // Atribui as colunas a variáveis
                int codigo = Integer.parseInt(colunas[0]);
                String nomeCidade = colunas[1];
                String estado = colunas[2];
                int populacao = Integer.parseInt(colunas[3]);

                Cidade cidade = new Cidade(codigo, nomeCidade, estado, populacao);

                if (cidade.getPopulacao() >= maior) {
                    nomeMaior = cidade.getNome();
                    maior = cidade.getPopulacao();
                }
                if (cidade.getPopulacao() <= menor) {
                    nomeMenor = cidade.getNome();
                    menor = cidade.getPopulacao();
                }
            }

            System.out.println("Menor: " + nomeMenor);
            System.out.println("Maior: " + nomeMaior);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
