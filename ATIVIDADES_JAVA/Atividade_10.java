/*******************************************************************************
* 18) Escreva um programa que leia um número inteiro (variável CODIGO). Verificar se o código
* é igual a 1, igual a 2 ou igual a 3. Caso não seja, apresentar a mensagem “Código inválido”.
* Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar cada
* código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem
* “um”, ”dois” ou “três”. (Utilizar o comando Switch).
*******************************************************************************/


package ATIVIDADES_JAVA;

import java.util.Scanner;

public class Atividade_10 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.print("Digite o Código: ");
        codigo = teclado.nextInt();

        switch(codigo){
            case 1:
                    System.out.println("UM");
                    break;
            case 2:
                    System.out.println("DOIS");
                    break;        
            case 3:
                    System.out.println("TRÊS");
                    break;        
            default:
                    System.out.println("Código inválido");        
        }
    }
}
