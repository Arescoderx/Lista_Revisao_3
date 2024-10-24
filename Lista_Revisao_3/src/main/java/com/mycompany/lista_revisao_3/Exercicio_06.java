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
public class Exercicio_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        float somanotas = 0;
        System.out.println("Calculo da Media das Notas");

        for (int i = 1; i <= 3; i++) {
            System.out.println("Insira a Nota " + i);
            float num = ler.nextFloat();

            somanotas = somanotas + num;
        }
        float resultado = somanotas / 3;
        System.out.println("A media das notas e " + resultado);
    }
}
