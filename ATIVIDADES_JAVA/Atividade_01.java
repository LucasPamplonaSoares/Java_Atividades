/* 1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. */

package ATIVIDADES_JAVA;

import java.util.Scanner;

public class Atividade_01 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double quantidade_minima, quantidade_maxima, estoque_medio;

    System.out.print("Calculadora de Estoque Médio\n");

    System.out.print("DIgite a quantidade mínima: ");
    quantidade_minima = entrada.nextDouble();

    System.out.println("Digite a quantidade máxima: ");
    quantidade_maxima = entrada.nextDouble();
    estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
    System.out.println("Estoque Médio = " + estoque_medio + "\n");
  }
}