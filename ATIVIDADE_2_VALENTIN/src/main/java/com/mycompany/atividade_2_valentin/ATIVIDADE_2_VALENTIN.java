/*
 * Número Par ou Ímpar

   O sistema de controle de estoque da TechSolve precisa identificar se a quantidade de itens em estoque de um determinado produto é par ou ímpar. Desenvolva essa funcionalidade.
 */

package com.mycompany.atividade_2_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_2_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numItem;
        
        System.out.print("Digite a quantidade de itens do estoque: ");
        numItem = ler.nextInt();
        
        if(numItem % 2 == 0){
            System.out.print("A quantidade de itens  par");
        }
        else{
            System.out.print("A quantidade de itens e impar");
        }
        
    }
}
