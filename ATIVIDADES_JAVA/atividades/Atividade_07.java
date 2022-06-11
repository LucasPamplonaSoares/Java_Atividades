/*******************************************************************************
* 7) Escreva um programa que leia quatro notas escolares de um aluno e
* apresentar uma mensagem que o aluno foi aprovado se o valor da média escolar
* for maior ou igual a 7. Se o valor da média for menor que 7, solicitar a nota
* do recuperação, somar com o valor da média e obter a nova média. Se a nova
* média for maior ou igual a 7, apresentar uma mensagem informando que o aluno
* foi aprovado na recuperação. Se o aluno não foi aprovado, apresentar uma
* mensagem informando esta condição. Apresentar junto com as mensagens o valor
* da média do aluno.
*******************************************************************************/

package atividades;

import java.util.Scanner;

public class Atividade_07 {
    
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double n1, n2, n3, n4, recuperacao, media;
       boolean Aprovado = false;
       
       System.out.print("Digite a Primeira Nota: ");
       n1 = teclado.nextDouble();

       System.out.print("Digite a Segunda nota: ");
       n2 = teclado.nextDouble();

       System.out.print("Digite a Terceira nota: ");
       n3 = teclado.nextDouble();

       System.out.print("Digite a Quarta nota: ");
       n4 = teclado.nextDouble();

       media = (n1 + n2 + n3 + n4) / 4;

       if (media >=7) Aprovado = true;
       else{
         System.out.print("O aluno ficou em recuperação, digite a nota: ");
         recuperacao = teclado.nextDouble();
         media = (media + recuperacao) / 2;
         if (media >= 7) Aprovado = true;
       }

       if(Aprovado == true){
        System.out.println("\n\nO Aluno foi aprovado com a média "+media);
      }else{
        System.out.println("\n\nO Aluno foi reprovado com a média "+media);
      }
    }
}
