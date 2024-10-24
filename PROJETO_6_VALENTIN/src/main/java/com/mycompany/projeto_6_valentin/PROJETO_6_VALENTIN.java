/*
 * Média de Três Números

    Uma função de avaliação de desempenho precisa calcular a média de três notas inseridas por um funcionário. Desenvolva a solução.
 */

package com.mycompany.projeto_6_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class PROJETO_6_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numUm;
        int numDois;
        int numTres;
        double media;
        
        System.out.print("Digite a primeira nota: ");
        numUm = ler.nextInt();
        System.out.print("Digite a segunda nota: ");
        numDois = ler.nextInt();
        System.out.print("Digite a terceira nota: ");
        numTres = ler.nextInt();
        
        media = (numUm + numDois + numTres)/3;
        
        System.out.print("A media da nota foi de: " + media);
        
    }
}
