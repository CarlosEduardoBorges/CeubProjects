import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, y;
        boolean _verificador = true;
        x = sc.nextInt();
        y = sc.nextInt();

        while (_verificador == true) {
            if (x > 0 && y > 0) {
                System.out.println("PRIMEIRO QUADRANTE");
            } else if (x < 0 && y > 0) {
                System.out.println("SEGUNDO QUADRANTE");
            } else if (x < 0 && y < 0) {
                System.out.println("TERCEIRO QUADRANTE");
            } else if (x > 0 && y < 0) {
                System.out.println("QUARTO QUADRANTE");
            } else if (x == 0 | y == 0) {
                _verificador = false;
                System.out.println("NÃO FAZ PARTE DE NENHUM QUADRANTE");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }
        sc.close();
    }
}