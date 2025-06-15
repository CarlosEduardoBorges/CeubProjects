import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int _R = sc.nextInt();

        // O laço for corrigido
        // Itera enquanto N for menor que _R, incrementando N a cada passo
        for (; N <= _R; N++) {
            System.out.println(N);
        }

        sc.close();
    }
}