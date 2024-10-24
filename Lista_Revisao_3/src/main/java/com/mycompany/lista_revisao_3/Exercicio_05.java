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
public class Exercicio_05 {

    public static void main(String[] args) throws InterruptedException {
        Scanner ler = new Scanner(System.in);

        System.out.println("Finalizando Processo");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Processo Finalizado");
    }
}
