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
 * @author m.schmidt
 */
public class Exercicio_10 {

    public static void main(String[] args) throws IOException {
        String ler = " ";
        DataInputStream dado;

        int quant = quantidadeclientes();
        int RespostaFilme[] = new int[quant];
        int QuantCategoria[] = new int[4];

        PreenchendoFilme(RespostaFilme, quant);

        for (int i = 0; i <= (quant - 1); i++) {

            switch (RespostaFilme[i]) {
                case 1:
                    QuantCategoria[0] = QuantCategoria[0] + 1;
                    break;
                case 2:
                    QuantCategoria[1] = QuantCategoria[1] + 1;
                    break;
                case 3:
                    QuantCategoria[2] = QuantCategoria[2] + 1;
                    break;
                default:
                    QuantCategoria[3] = QuantCategoria[3] + 1;
                    break;
            }
        }
        
        imprimir(QuantCategoria);

    }

    public static int quantidadeclientes() throws IOException {
        String ler = "";
        DataInputStream dado;
        dado = new DataInputStream(System.in);

        System.out.println("Digite a Quantidade de clientes que vao participar da pesquisa: ");
        ler = dado.readLine();
        int quant = Integer.parseInt(ler);

        return quant;
    }

    public static void PreenchendoFilme(int RespostaFilme[], int quant) throws IOException {

        System.out.println("Digite o Genero Favorito");

        for (int i = 0; i <= (quant - 1); i++) {

            String ler = "";
            DataInputStream dado;
            dado = new DataInputStream(System.in);

            System.out.println("(1 = Ação, 2 = Comédia, 3 = Drama, 4 = Outros)");
            System.out.println("Participante " + (i + 1) + " :");
            ler = dado.readLine();

            RespostaFilme[i] = Integer.parseInt(ler);

        }

    }

    public static void imprimir(int QuantCategoria[]) throws IOException {
        
        String mensagem = "RESUMO DA PESQUISA" + "\n" + "QUANTIDADE ESCOLHIDA" + "\n"
                + "Ação: " + QuantCategoria[0] + "\n" + "Comédia: " + QuantCategoria[1] + "\n" + "Drama: " + QuantCategoria[2] + "\n" + "Outros: " + QuantCategoria[3];

        JOptionPane.showMessageDialog(null, mensagem);

        FileWriter arquivo = new FileWriter("C:\\Users\\mathe\\OneDrive\\Área de Trabalho\\Textos\\" + "ResumoPesquisa" + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(mensagem);
        arquivo.close();
    }
}
