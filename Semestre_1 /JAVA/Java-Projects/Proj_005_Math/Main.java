import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y, z, a, b, c;

        System.out.println("DIGITE 3 VALORES PARA EU REALIZAR A SOMA DE SUA RAIZ");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(z);


        System.out.println("");
        System.out.printf("O VALOR DA RAIZ DE %.1f é: %.2f%n", x, a);
        System.out.printf("O VALOR DA RAIZ DE %.1f é: %.2f%n", y, b);
        System.out.printf("O VALOR DA RAIZ DE %.1f é: %.2f%n", z, c);


        sc.close();
    }
}