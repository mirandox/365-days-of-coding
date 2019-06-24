/***
 *   Exercício n° 1013 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1013
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class OMaior {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maiorABC = (maiorAB + c + Math.abs(maiorAB - c)) / 2;

        System.out.println(maiorABC + " eh o maior");
    }
}
