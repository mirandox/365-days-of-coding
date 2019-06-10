package uri.problemas;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {

    public static void main(String[] args) throws IOException {

        int a = 0, b = 0, x = 0;

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        x = a + b;

        System.out.println("X = " + x);
    }
}
