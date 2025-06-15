import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int X = sc.nextInt();

        if (X % 2 == 0 ) System.out.println("Par");
        else System.out.println("Impar");

        System.out.println("DIGITE O NÚMERO");

        sc.close();
    }
}