/*******************************************************************************
* 3) Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos
* valores de modo que a variável A passe a possuir o valor da variável B, e a
* variável B passe a possuir o valor da variável A. Apresentar os valores
* trocados.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int A, B, VariavelTemporaria;

        System.out.print("Digite a Variável de A: ");
        A  = teclado.nextInt();

        System.out.print("Digite a Variável de B: ");
        B = teclado.nextInt();

        VariavelTemporaria = A;
        A = B;
        B = VariavelTemporaria;

        System.out.print("A="+A+" | B="+B+"\n");
    }
    
}
