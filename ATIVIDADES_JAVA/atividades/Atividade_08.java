/*******************************************************************************
* 8) Escreva um programa que leia dois números e exiba mensagem informando o
* valor do maior número e o valor do menor número. Se os dois números forem
* iguais, o programa deve exibir mensagem informando este fato.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_08 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o Primeiro Número: ");
        n1 = teclado.nextInt();

        System.out.print("Digite o Segundo Número: ");
        n2 = teclado.nextInt();

        if (n1 > n2) {
            System.out.println("O Primeiro Número é maior que o Segundo Número");
        }else if(n1 < n2){
            System.out.println("O Segundo Número é maior que o Primeiro Número");
        }else{
            System.out.println("Os dois números sãso iguais");
        }
    }
}
