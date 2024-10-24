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
public class Exercicio_16 {

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

        for (int i = quant - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                if (vetor[j] > vetor[j + 1]) {

                    int troca = 0;
                    troca = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = troca;

                }
            }
        }
        System.out.println("Seus Numeros Ordenados");
        for (int i = 0; i < quant; i++) {
            
            System.out.println(vetor[i]);
            
        }

    }
}

