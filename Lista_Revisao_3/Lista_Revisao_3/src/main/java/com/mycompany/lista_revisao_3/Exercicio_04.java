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
public class Exercicio_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva um numero para saber a tabuada dele:");
        int num = ler.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
