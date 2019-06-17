/***
 *   Exercício n° 1008 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Salario {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int matricula = scanner.nextInt();
        int horas = scanner.nextInt();
        double valor = scanner.nextDouble();

        double salario = horas * valor;

        System.out.println("NUMBER = " + matricula);
        System.out.printf("SALARY = U$ %.2f%n", salario);
    }
}
