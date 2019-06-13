/***
 *   Exercício n° 1001 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1001
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
    }
}
