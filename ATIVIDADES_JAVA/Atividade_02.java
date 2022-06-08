/*******************************************************************************
* 2) Escrever um programa que leia dois números inteiros e mostre todos os 
* relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
* são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.
*******************************************************************************/

package ATIVIDADES_JAVA;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        boolean Igual = false, NaoIgual = false, Maior = false, Menor = false, MaiorOuIgual = false, MenorOuIgual = false;

        System.out.print("Digite o Primeiro Número: ");
        n1 = teclado.nextInt();

        System.out.print("Digite o Segundo Número: ");
        n2 = teclado.nextInt();

        if (n1 == n2) Igual = true;
        if (n1 != n2) NaoIgual = true;
        if (n1 > n2) Maior = true;
        if (n1 < n2) Menor = true;
        if (n1 >= n2) MaiorOuIgual = true;
        if (n1 <= n2) MenorOuIgual = true;

        System.out.println("\nIgual = "+Igual);
        System.out.println("Não Igual = "+NaoIgual);
        System.out.println("Maior = "+Maior);
        System.out.println("Menor = "+Menor);
        System.out.println("Maior ou igual = "+MaiorOuIgual);
        System.out.println("Menor ou igual = "+MenorOuIgual);

    }
}
