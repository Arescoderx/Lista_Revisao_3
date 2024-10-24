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
public class Exercicio_03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva a pontuacao do jogador numero 1");
        float num1 = ler.nextFloat();
        
        System.out.println("Escreva a pontuacao do jogador numero 2");
        float num2 = ler.nextFloat();
        
        if(num1 == num2){
            System.out.println("A pontuacao dos dois foram igual com " + num1);
        }
        else if(num1 > num2){
            System.out.println("A pontuacao do jogador 1 foi maior que a do jogador 2 com "+ num1);
        }
        else{
            System.out.println("A pontuacao do jogador 2 foi maior que a do jogador 1 com "+ num2);
        }
    }
}
