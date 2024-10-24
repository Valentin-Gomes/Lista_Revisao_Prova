/*
 *  Soma de Dois Números

    Você precisa criar uma calculadora simples para ajudar seu colega a somar dois números rapidamente. Esse será seu primeiro desafio.
 */

package com.mycompany.atividade_1_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_1_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numUm;
        int numDois;
        int soma;
        
        System.out.print("Digite o primeiro numero: ");
        numUm = ler.nextInt();
        System.out.print("Digite o segundo numero: ");
        numDois = ler.nextInt();
        
        soma = numUm + numDois;
        
        System.out.print("A soma foi de: " + soma);
        
        
    }
}
