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
public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de itens no estoque para verificar se a quantidade é impar ou par:");
        int num = ler.nextInt();
        
        verificacao(num);
    }

    public static void verificacao(int num) {
        
        int verificacao = num % 2;
        
        if(verificacao == 0){
            System.out.println("A quantidade do seu estoque é par");
        }
        else{
            System.out.println("A quantidade do seu estoque é impar");
        }
    }
}
