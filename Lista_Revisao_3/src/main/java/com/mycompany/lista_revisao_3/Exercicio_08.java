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
public class Exercicio_08 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quant = 0;
        float soma = 0;
        
        System.out.println("Sistema de Media de Notas");
        
        System.out.println("Digite a Media:");
        float media  = ler.nextFloat();
        
        System.out.println("Agora Insira as Notas do Aluno");
        
        for (;;) {
            System.out.println("Insira nota " + (quant+1) + ": (Caso todas as notas forem registradas digite *0* ");
            float nota = ler.nextFloat();
            
            if (nota == 0) {
                break;
                
            } else {
                soma = soma + nota;
                quant++;
            }
        }
        
        float resultado = soma/quant;
        
        System.out.println("A media das notas foi " + resultado);
        
        if(resultado >= media){
            System.out.println("Esse aluno foi aprovado");
        }
        else{
            System.out.println("Esse aluno foi reprovado");
        }
    }
}
