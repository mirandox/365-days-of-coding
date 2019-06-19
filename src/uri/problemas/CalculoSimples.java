/***
 *   Exercício n° 1010 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
 */


package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int quantidadePeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int quantidadePeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double preco = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", preco);
    }
}
