/*******************************************************************************
* 5) Escreva um programa que leia 3 números inteiros e imprima na tela os
* valores em ordem decrescente.
*******************************************************************************/

package atividades;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_05 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int qtd = 3;
        int[] n = new int[qtd];

        for (int x = 0; x < qtd; x++) {
            System.out.print("Digite o " +(x+1)+ "número: ");
            n[x] = teclado.nextInt();
        }

        Arrays.sort(n);

        System.out.println("\n\nOs números em ordem crescente são:");
        for (int Numero : n) {
          System.out.println(Numero);
        }
    }
}
