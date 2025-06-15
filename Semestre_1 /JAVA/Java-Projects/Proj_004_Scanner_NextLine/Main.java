import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int _idade;
        String x, y, z;

        System.out.println("DIGITE SEU NOME");
        x = sc.nextLine();
        System.out.println("DIGITE SUA DATA DE NASCIMENTO");
        y = sc.nextLine();
        System.out.println("DIGITE SUA IDADE");
        _idade = sc.nextInt();
        System.out.println("SEU CPF");
        sc.nextLine(); // É preciso fazer isso para evitar erros na quebra de linha
        z = sc.nextLine();

        System.out.println("");
        System.out.println("VERIFICANDO...");

        System.out.println("");
        System.out.println(x);
        System.out.println(y);
        System.out.println(_idade);
        System.out.println(z);

        sc.close();
    }
}