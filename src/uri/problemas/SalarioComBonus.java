/***
 *   Exercício n° 1009 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1009
 */


package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String nome = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double conta = vendas * 15 / 100;
        double total = conta + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);
    }
}
