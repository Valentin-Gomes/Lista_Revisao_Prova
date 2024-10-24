/*
 * Maior entre Dois Números

    Em um sistema de pontuação, você precisa comparar a pontuação de dois jogadores e determinar quem venceu a partida.
 */

package com.mycompany.ativiade_3_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIADE_3_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numUm;
        int numDois;
        
        System.out.print("Digite a primeira pontuacao: ");
        numUm = ler.nextInt();
        System.out.print("Digite a segunda pontuaco: ");
        numDois = ler.nextInt();
        
        if(numUm == numDois){
            System.out.print("Empate!");
        }
        else if(numUm > numDois){
            System.out.print("A primeira pontucao e maior");
        }
        else{
            System.out.print("A segunda pontucao e maior");
        }
        
    }
}
