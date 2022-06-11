/*******************************************************************************
* 9) Escreva um programa que leia um número inteiro. Verificar por meio de condição se o
* valor fornecido está na faixa entre 0 (zero) e 9 (nove). Caso o valor fornecido esteja dentro da
* faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor
*  inválido”.
*******************************************************************************/


package atividades;

import java.util.Scanner;

public class Atividade_09 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Digite o Primeiro Número: ");
        numero = teclado.nextInt();

        if(numero >=0 && numero <= 9){
            System.out.println("Valor Válido");
        }else{
            System.out.println("Valor Inválido");
        }
    }
}
