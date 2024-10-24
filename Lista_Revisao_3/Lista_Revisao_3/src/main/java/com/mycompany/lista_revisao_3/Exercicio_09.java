/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
        String mensagem = "RESUMO DA COMPRA" + "\n" + "CLIENTE:" + nome + "\n";

        mensagem += "-----------------------" + "\n";
        for (int i = 0; i <= (quant - 1); i++) {

            mensagem += "ITEM " + (i + 1) + " :" + nomeprod[i] + "\n" + "QUANTIDADE:" + quantprod[i] + "\n" + "PREÇO:" + precoprod[i] + "\n" + "-----------------------" + "\n";

        }
        mensagem += "Valor total da compra: " + valortotal;
        JOptionPane.showMessageDialog(null, mensagem);
        
        imprimir(nome, nomeprod, quantprod, precoprod, valortotal, quant);
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

    public static void imprimir(String nome, String nomeprod[], int quantprod[], float precoprod[], float valortotal, int quant) throws IOException {
        String mensagem = "RESUMO DA COMPRA" + "\n" + "CLIENTE: " + nome + "\n";

        mensagem += "-----------------------" + "\n";
        for (int i = 0; i <= (quant - 1); i++) {

            mensagem += "ITEM " + (i + 1) + " : " + nomeprod[i] + "\n" + "QUANTIDADE: " + quantprod[i] + "\n" + "PREÇO: " + precoprod[i] + "\n" + "-----------------------" + "\n";

        }
        mensagem += "Valor total da compra: " + valortotal;
        JOptionPane.showMessageDialog(null, mensagem);

        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Textos\\" + "ResumoCliente" + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(mensagem);
        arquivo.close();

    }

}
