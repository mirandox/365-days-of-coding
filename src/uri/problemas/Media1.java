/***
 *   Exercício n° 1005 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1005
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Media1 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double nota = (a / 11 * 3.5) + (b / 11 * 7.5);

        System.out.printf("MEDIA = %.5f%n", nota);
    }
}
