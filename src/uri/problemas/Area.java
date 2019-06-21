/***
 *   Exercício n° 1012 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1012
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) throws IOException {

        double a, b, c;

        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.printf("TRIANGULO: %.3f\n", (a * c) / 2);
        System.out.printf("CIRCULO: %.3f\n", c * c * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) / 2) * c);
        System.out.printf("QUADRADO: %.3f\n", b * b);
        System.out.printf("RETANGULO: %.3f\n", a * b);
    }
}
