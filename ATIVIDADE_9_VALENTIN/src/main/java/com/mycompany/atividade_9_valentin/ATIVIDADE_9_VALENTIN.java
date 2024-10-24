/*
 * Sistema de Pedidos de Restaurante

    Você foi contratado para desenvolver um sistema simples de pedidos para um restaurante. O cliente deve inserir seu nome e os itens que deseja pedir, além da quantidade de cada item.
    O sistema deve calcular o valor total do pedido e gerar um arquivo com os detalhes do pedido.

    Solicite o nome do cliente.
    Pergunte quantos itens ele deseja pedir.
    Para cada item, armazene o nome e a quantidade em vetores.
    Use um vetor para armazenar o preço de cada item.
    Calcule o valor total e mostre o resumo do pedido com JOptionPane.showMessageDialog.
    Salve os detalhes do pedido e o valor total em um arquivo de texto.
 */

package com.mycompany.atividade_9_valentin;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_9_VALENTIN {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        
        String nomeCliente;
        int item = 0;
        
        System.out.print("Digite seu nome: ");
        nomeCliente = ler.next();
        System.out.print("Digite quantos itens vai pedir: ");
        item = ler.nextInt();
        
        String nomeItem[] = new String[item];
        int qtdItemVetor[] = new int[item];
        double preco[] = new double[item];
        double valorTotal = 0;
        
     
        

        
        for(int c = 0; c < item; c++){
            System.out.print("Digite o nome do item: ");
            nomeItem[c] = ler.next();
            System.out.print("Digite o preco do item: ");
            preco[c] = ler.nextDouble();
            System.out.print("Digite a quatidade: ");
            qtdItemVetor[c] = ler.nextInt();
        }
        
        for(int c = 0; c < item; c++){
            valorTotal = valorTotal + (preco[c] * qtdItemVetor[c]);
        }
        
        String nomeArquivo = "Pedido do " + nomeCliente;
        FileWriter arquivo = new FileWriter("P:\\TURMAS\\HTC-DDS-19\\Valentin Gomes\\Programação de Aplicativos\\Projetos\\LISTA REVISAO PROVA\\ATIVIDADE_9_VALENTIN " + nomeArquivo + ".txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        gravar.println("Cliente: " + nomeCliente);
        
        for(int c = 0; c < item; c++){
            gravar.println(qtdItemVetor[c] + "X " + nomeItem[c] + (qtdItemVetor[c] * preco[c]));
        }
        
        gravar.println("Valor total: " + valorTotal);
    }
    

}