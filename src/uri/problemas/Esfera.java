/***
 *   Exercício n° 1011 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1011
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Esfera {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double volume = (4.0 / 3) * 3.14159 * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
