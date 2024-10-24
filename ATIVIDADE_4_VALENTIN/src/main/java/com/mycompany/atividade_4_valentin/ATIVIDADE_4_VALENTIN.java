/*
 * Tabuada de um Número

    A TechSolve está desenvolvendo uma ferramenta educacional para crianças. Sua tarefa é programar uma função que exibe a tabuada de um número fornecido.
 */

package com.mycompany.atividade_4_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_4_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int num;
        
        System.out.print("Digite um numero para fazer a tabuada dele: ");
        num = ler.nextInt();
        
        for(int c = 1; c <= 9; c++){
            System.out.println(num + " * " + c + " = " + (num * c));
        }
        
    }
}
