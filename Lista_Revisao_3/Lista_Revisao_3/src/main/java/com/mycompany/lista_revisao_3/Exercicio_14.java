/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_revisao_3;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;
import javax.swing.JOptionPane;

/**
 *
 * @author mathe
 */
public class Exercicio_14 {

    public static void main(String[] args) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        int quant = quantidade();
        Float salariofuncionario[] = new Float[quant];
        String nomefuncionario[] = new String[quant];

        nome_e_salario(salariofuncionario, nomefuncionario, quant);

        for (;;) {

            System.out.println("DESEJA ATULIZAR O SALARIO DE ALGUM FUNCIONARIO? (1-Sim e 2-Não)");
            ler = dado.readLine();
            int escolha = Integer.parseInt(ler);

            if (escolha == 1) {
                atualizar(salariofuncionario, nomefuncionario, quant);
            } else if (escolha == 2) {
                break;
            } else {
                System.out.println("VOCE DIGITOU O NUMERO ERRADO");
            }
        }

        imprimir(salariofuncionario, nomefuncionario, quant);

    }

    public static int quantidade() throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("Digite quantos Funcionarios serão cadastrados:");
        ler = dado.readLine();
        int quantidade = Integer.parseInt(ler);

        return quantidade;
    }

    public static void nome_e_salario(Float salariofuncionario[], String nomefuncionario[], int quant) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("CADASTRO DOS FUNCIONARIOS");

        for (int i = 0; i < quant; i++) {
            System.out.println("CADASTRO FUNCIONARIO: " + (i + 1));

            System.out.println("NOME DO FUNCIONARIO: ");
            ler = dado.readLine();
            nomefuncionario[i] = ler;

            System.out.println("SALARIO DO FUNCIONARIO: ");
            ler = dado.readLine();
            salariofuncionario[i] = Float.parseFloat(ler);
        }
    }

    public static void atualizar(Float salariofuncionario[], String nomefuncionario[], int quant) throws IOException {
        String ler = "";
        DataInputStream dado = new DataInputStream(System.in);

        System.out.println("INSIRA O NUMERO DO FUNCIONARIO QUE DESEJA ATUALIZAR:");
        ler = dado.readLine();
        int i = Integer.parseInt(ler);
        System.out.println("QUAL SERA O NOVO SALARIO DO FUNCIONARIO " + nomefuncionario[(i - 1)] + " :");
        ler = dado.readLine();
        salariofuncionario[(i - 1)] = Float.parseFloat(ler);
    }

    public static void imprimir(Float salariofuncionario[], String nomefuncionario[], int quant) throws IOException {
        String mensagem = quant + " FUNCIONARIOS CADASTRADOS \n";
        
        mensagem += "-------------------------\n";
        
        for (int i = 0; i < quant; i++) {
            mensagem += "FUNCIONARIO " + (i + 1) + " :" + nomefuncionario[i] + "\n" +
                    "SALARIO: " + salariofuncionario[i];
            mensagem += "\n-------------------------";
        }

        JOptionPane.showMessageDialog(null, mensagem);
        FileWriter arquivo = new FileWriter("C:\\Users\\m.schmidt\\Desktop\\Nova pasta\\" + "CasdastroFuncionario" + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.printf(mensagem);
        arquivo.close();
    }
}
