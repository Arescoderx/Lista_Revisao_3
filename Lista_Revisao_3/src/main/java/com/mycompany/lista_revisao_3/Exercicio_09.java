/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author m.schmidt
 */
public class Exercicio_09 {

    public static void main(String[] args) throws IOException {
        String ler = " ";
        DataInputStream dado;

        String nome = nome();
        int quant = Itens();

        String nomeprod[] = new String[quant];
        int quantprod[] = new int[quant];
        float precoprod[] = new float[quant];

        float valortotal = (float) 0;

        for (int i = 0; i <= (quant - 1); i++) {

            System.out.println("Escreva o nome do item:");
            dado = new DataInputStream(System.in);
            ler = dado.readLine();
            nomeprod[i] = ler;

            System.out.println("Escreva a quantidade do item:");
            ler = dado.readLine();
            int qntprod = Integer.parseInt(ler);
            quantprod[i] = qntprod;

            System.out.println("Escreva o preco do item");
            ler = dado.readLine();
            float preco = Float.parseFloat(ler);
            precoprod[i] = preco;

            System.out.println("ITEM ADICIONADO A CONTA");
        }
        for (int i = 0; i <= (quant - 1); i++) {
            float multiplicacao = precoprod[i] * quantprod[i];
            valortotal = valortotal + multiplicacao;
        }
        StringBuilder mensagem = new StringBuilder();
        mensagem.append("RESUMO DA CONTA").append("\n");
        mensagem.append("---------------------------------").append("\n");
        mensagem.append("NOME DO CLIENTE: ").append(nome).append("\n");
        mensagem.append("---------------------------------").append("\n");
        for (int i = 0; i < quant; i++) {
            mensagem.append(nomeprod[i]).append("\n").append("Quantidade: ").append(quantprod[i]).append("\n").append("Preço: ").append(precoprod[i]).append("\n");
            mensagem.append("---------------------------------").append("\n");
        }
        mensagem.append("VALOR TOTAL:").append(valortotal).append("\n");
        mensagem.append("---------------------------------").append("\n");
        JOptionPane.showMessageDialog(null, mensagem.toString(), "Resumo da Conta", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String nome() throws IOException {
        String ler = " ";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Escreva o nome do Cliente:");
        ler = reader.readLine();

        return ler;
    }

    public static int Itens() throws IOException {
        String ler = " ";
        DataInputStream dado;

        System.out.println("Digite a quantidade de itens que seu client deseja pedir");
        dado = new DataInputStream(System.in);
        ler = dado.readLine();

        int quantidade = Integer.parseInt(ler);

        return quantidade;

    }

}
