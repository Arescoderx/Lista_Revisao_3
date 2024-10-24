/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.util.Scanner;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int produtos[] = new int[10];
        int resultado = 0;
        System.out.println("Prencha o vetor com os codigos dos produtos");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Codigo " + i + ":");
            produtos[(i - 1)] = ler.nextInt();
        }

        System.out.println("Pesquise no vetor se o codigo está lista");
        System.out.println("Digite o codigo:");
        int codigo = ler.nextInt();

        for (int i = 1; i < 10; i++) {
            if (codigo == produtos[(i - 1)]) {
                System.out.println("Seu codigo foi encontrado no vetor na posicao "+ i);
                resultado = 1;
                break;
            }
        }
        if (resultado == 0) {
            System.out.println("Seu codigo não foi encontrado no vetor");
        }
    }
}
