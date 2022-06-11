import java.util.Scanner;

/*************************************************************************
 *  12) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

public class Atividade_12 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double cotacao_dolar, valor_dolar, valor_real;

        System.out.print("Digite a cotação do dolar: ");
        cotacao_dolar = teclado.nextDouble();

        System.out.print("Digite o valor do Dolar: ");
        valor_dolar = teclado.nextDouble();

        valor_real = cotacao_dolar * valor_dolar;

        System.out.print("O valor em reais é " + valor_real + "\n");
    }
}
