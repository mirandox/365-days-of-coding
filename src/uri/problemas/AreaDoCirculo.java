/***
 *   Exercício n° 1002 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1002
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = 3.14159 * Math.pow(raio, 2);

        System.out.printf("A=%.4f%n" , area);

    }
}
