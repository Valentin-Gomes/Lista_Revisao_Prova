/*
 * Média de Notas de Alunos

   O sistema educacional em que você está trabalhando precisa calcular a média de um aluno e informar se ele foi aprovado ou reprovado.
 */

package com.mycompany.atividade_8_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_8_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numUm;
        int numDois;
        double media;
        
        System.out.print("Digite a primeira nota: ");
        numUm = ler.nextInt();
        System.out.print("Digite a segunda nota: ");
        numDois = ler.nextInt();
        
        media = (numUm + numDois)/2;
        
        if(media >= 6){
            System.out.print("Aprovado!");
        }
        else{
            System.out.print("Reprovado!");
        }
    }
}
