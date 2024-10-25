/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_15 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int quant = quantidade();

        String categoria[] = new String[3];
        int QuantCategoria[] = new int[3];
        int escolhido[] = new int[quant];

        alocando(categoria);

        FilmeEscolhido(quant, categoria, escolhido);
        
        contando(quant, categoria, escolhido,QuantCategoria);

    }

    public static int quantidade() throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("DIGITE QUANTAS PESSOAS PARTICIPARAM DA PESQUISA:");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);
        return quant;
    }

    public static void alocando(String categoria[]) {
        for (int i = 0; i <= 3; i++) {
            switch (i) {
                case 1:
                    categoria[i] = "Rock";
                    break;
                case 2:
                    categoria[i] = "PoP";
                    break;
                default:
                    categoria[i] = "Outros";
                    break;
            }
        }
    }

    public static void FilmeEscolhido(int quant, String categoria[], int escolhido[]) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        for (int i = 0; i < quant; i++) {

            System.out.println("DIGITE O NUMERO DO SEU GENERO FAVORITO");
            System.out.println("1 - ROCK");
            System.out.println("2 - POP");
            System.out.println("3 - OUTROS");
            ler = dado.readLine();
            escolhido[i] = Integer.parseInt(ler);
        }

    }

    public static void contando(int quant, String categoria[], int escolhido[], int QuantCategoria[]) {

        for (int i = 0; i < quant; i++) {
            switch (escolhido[i]) {
                case 1:
                    QuantCategoria[0] = QuantCategoria[0] + 1;
                    break;

                case 2:
                    QuantCategoria[1] = QuantCategoria[1] + 1;
                    break;

                default:
                    QuantCategoria[2] = QuantCategoria[2] + 1;
                    break;
            }
        }
        System.out.println("QUANTIDADE ESCOLHIDA:");
        System.out.println("ROCK: " + QuantCategoria[0]);
        System.out.println("POP: " + QuantCategoria[1]);
        System.out.println("OUTRO: " + QuantCategoria[2]);
    }

    public static void imprimir(int quant, String categoria[], int escolhido[], int QuantCategoria[]) {

    }
}
