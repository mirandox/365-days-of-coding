/***
 *   Exercício n° 1006 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1006
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Media2 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double nota = (a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5);

        System.out.printf("MEDIA = %.1f%n", nota);
    }
}
