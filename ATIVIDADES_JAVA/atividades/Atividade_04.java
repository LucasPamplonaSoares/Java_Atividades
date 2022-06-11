/*******************************************************************************
* 4) Escreva um programa que leia um número inteiro e exiba o seu módulo.
*   O módulo de um número x é:
*   x se x é maior ou igual a zero
*   x * (-1) se x é menor que zero
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_04 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, modulo_n;

        System.out.print("Digite um número inteiro: ");
        n = teclado.nextInt();

        modulo_n = (n < 0)? modulo_n = n * (-1):n;

        System.out.print("O módulo do número é " +modulo_n+ "\n");
    }
}
