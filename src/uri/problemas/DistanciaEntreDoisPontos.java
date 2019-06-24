/*
 *   Exercício n° 1015 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1015
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        String resultado = String.format("%.4f", distancia);

        System.out.println(resultado);
    }
}
