/***
 *   Exercício n° 1004 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1004
 */


package uri.problemas;

import java.util.Scanner;

public class ProdutoSimples {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int prod = a * b;

        System.out.println("PROD = " + prod);
    }
}
