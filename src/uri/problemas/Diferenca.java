/***
 *   Exercício n° 1007 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int diferenca = (a * b - c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}
