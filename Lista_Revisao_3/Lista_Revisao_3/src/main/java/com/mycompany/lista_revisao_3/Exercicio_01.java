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
public class Exercicio_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva o primeiro numero:");
        int num1 = ler.nextInt();

        System.out.println("Escreva o segundo numero:");
        int num2 = ler.nextInt();

        int resultado = num1 + num2;

        System.out.println("O resultado da soma de " + num1 + " + " + num2 + " = " + resultado);
    }
}
