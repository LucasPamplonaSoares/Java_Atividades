/*******************************************************************************
* 15) Faça um programa que leia um número. Se positivo armazene-o em A, se for
* negativo, em B. No final mostrar o resultado.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_15 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double A = 0, B = 0, numero;

        do{
            System.out.print("Digite um número, digite 0 para sair: ");
            numero = teclado.nextDouble();

            if(numero > 0){
                A += numero;
                System.out.print("Numero armazenado em A\n");
            }else if(numero < 0){
                B += numero;
                System.out.print("Numero armazenado em B\n");
            }
        }while(numero != 0);
        System.out.printf("A= %2f\nB= %2f\n",A,B);
    }
}
