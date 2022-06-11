/*******************************************************************************
* 16) Escreva um programa que exiba as seguintes opções e realize os que se pede em cada
* uma delas:
*		1 – Adição
*		2 – Subtração
*		3 – Multiplicação
*		4 – Divisão
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_16 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, resultado;
        int menu;

        System.out.print("Digite uma das operações a seguir:\n\t1 - Adição\n\t2 - Subtração\n\t3 - Multiplicação\n\t4 - Divisão\n");
        menu = teclado.nextInt();

        System.out.print("Digite o Primeiro Número: ");
        n1 = teclado.nextDouble();

        System.out.print("Digite o Segundo Número: ");
        n2 = teclado.nextDouble();

        switch(menu){
            case 1:
                    resultado = n1 + n2;
                    System.out.printf("%f + %f = %f", n1, n2, resultado);
            
            case 2:
                    resultado = n1 - n2;
                    System.out.printf("%f - %f = %f", n1, n2, resultado);

            case 3:
                    resultado = n1 * n2;
                    System.out.printf("%f * %f = %f", n1, n2, resultado); 
                    
            case 4:
                    resultado = n1 / n2;
                    System.out.printf("%f / %f = %f", n1, n2, resultado);     
                    
            default:
                    System.out.print("Opção inválida!");        
        }
    }
}
