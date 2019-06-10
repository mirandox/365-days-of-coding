/***
 *   Exercício n° 1001 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1001
 */


package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) throws IOException {

        int a, b, x;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        x = a + b;

        System.out.println("X = " + x);
    }
}
