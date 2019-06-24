/***
 *   Exercício n° 1014 - https://www.urionlinejudge.com.br/judge/pt/problems/view/1014
 */

package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class Consumo {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();
        double litrosGastos = scanner.nextDouble();

        double consumo = km / litrosGastos;

        String resultado = String.format("%.3f", consumo);

        System.out.println(resultado + " km/l");
    }
}
