/*
 * Busca de Elemento em Vetor

    Em um sistema de inventário, o sistema precisa verificar se um produto está em uma lista de códigos. Sua tarefa é criar essa busca em um vetor.
 */

package com.mycompany.atividade_7_valentin;

import java.util.Scanner;

/**
 *
 * @author v.gomes
 */
public class ATIVIDADE_7_VALENTIN {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String inventario[] = {"pá","picareta","capacete","botina","luva"};
        String produto;
        boolean verifica = false;
        
        System.out.print("Digite um produto para buscar no inventario: ");
        produto = ler.next();
        
        for(int c = 0; c < inventario.length; c++){
            if(inventario[c].equals(produto)){
                System.out.print("produto localizado no inventario: " + inventario[c]);
                verifica = true;              
            }
        }
        
        if(verifica == false){
            System.out.print("Produto nao localizado no inventario: ");
        }
    }
}
