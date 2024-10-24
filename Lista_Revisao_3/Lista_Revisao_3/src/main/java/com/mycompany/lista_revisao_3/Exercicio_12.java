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
public class Exercicio_12 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite um numero e descubra se ele é primo: ");
        ler = dado.readLine();
        int num = Integer.parseInt(ler);

        if (num <= 1) {
            System.out.println("Esse número não é primo");
        }
        else if(Primo(num)){
            System.out.println("Esse numero é primo");
        }
        else{
            System.out.println("Esse numero não é primo");
        }

    }

   public static boolean Primo(int num) {
       
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}