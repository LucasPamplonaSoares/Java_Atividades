/*******************************************************************************
* 6) Escreva um programa que leia dois números e apresente a diferença do
* maior para o menor.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_06 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, diferenca;

        System.out.print("Digite o Primeiro Número: ");
        n1 = teclado.nextInt();

        System.out.print("Digite o Segundo Número: ");
        n2 = teclado.nextInt();

        if(n1 >= n2) {
            diferenca = n1 - n2;

        }else{
            diferenca = n2 - n1; 
        }

        System.out.println("\n A diferença do menor para o maior é " +diferenca);
    }
}
