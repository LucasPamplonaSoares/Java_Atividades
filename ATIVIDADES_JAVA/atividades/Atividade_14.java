/*******************************************************************************
* 14) Faça um programa que leia um número inteiro e mostre uma mensagem na tela
* indicando se este número é positivo ou negativo. Pare a execução do programa
* quando o usuário requisitar.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_14 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do{
            System.out.print("Digite um número, digite 0 para sair: ");
            numero = teclado.nextInt();
            if(numero > 0){
                System.out.print("O número é positivo\n");
            }else if(numero < 0){
                System.out.print("O número é negativo\n");
            }
        }while(numero != 0);
    }
}
