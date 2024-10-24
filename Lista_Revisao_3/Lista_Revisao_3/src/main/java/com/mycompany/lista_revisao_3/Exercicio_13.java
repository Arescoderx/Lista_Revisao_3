/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Exercicio_13 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int quant = quantidade();
        String nomeprod[] = new String[quant];
        Float valorprod[] = new Float[quant];

        NomeProduto(quant, nomeprod);
        ValorProduto(quant, valorprod);
        System.out.println("PRODUTOS CADASTRADOS!!");

        imprimir(nomeprod, valorprod, quant);

    }

    public static int quantidade() throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite quantos Produtos deseja cadastrar: ");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);

        return quant;
    }

    public static void NomeProduto(int quant, String nomeprod[]) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        for (int i = 0; i < quant; i++) {
            System.out.println("INSIRA NOME DO PRODUTO " + (i + 1) + ":");
            ler = dado.readLine();
            nomeprod[i] = ler;
        }
    }

    public static void ValorProduto(int quant, Float valorprod[]) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        for (int i = 0; i < quant; i++) {
            System.out.println("INSIRA PRECO DO PRODUTO " + (i + 1) + ":");
            ler = dado.readLine();
            valorprod[i] = Float.parseFloat(ler);
        }
    }

    public static void imprimir(String nomeprod[], Float valorprod[], int quant) throws IOException {
        
        String message = "PRODUTOS CADASTRADOS\n";
        message += "---------------------\n";
        
        for (int i = 0; i < quant; i++) {
            message += "PRODUTO " + (i + 1) + ": " + nomeprod[i] + "\n VALOR: "+ valorprod[i];
            message += "\n---------------------\n";           
        }
        JOptionPane.showMessageDialog(null, message);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Textos\\" + "ProdutoCadastrado" + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(message);
        arquivo.close();
    }
}
