/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author mathe
 */
public class Exercicio_11 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite a quantidade de numeros:");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);

        int vetor[] = new int[quant];

        for (int i = 0; i < quant; i++) {
            System.out.println("Digite o numero:" + (i + 1));
            ler = dado.readLine();
            vetor[i] = Integer.parseInt(ler);
        }

        int maior = vetor[0];
        int menor = vetor[0];
        int posmaior = 0;
        int posmenor = 0;

        for (int i = 0; i < quant; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posmaior = i;
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posmenor = i;
            }
        }
        System.out.println("O maior numero e: " + maior + " Na posicao: " + (posmaior + 1));
        System.out.println("O menor numero e: " + menor + " Na posicao: " + (posmenor + 1));
    }
}
