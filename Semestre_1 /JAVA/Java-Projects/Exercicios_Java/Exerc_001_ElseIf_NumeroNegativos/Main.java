import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X < 0) System.out.println("Negativo");
        else if (X == 0) {
            System.out.println("Nulo");
        } else System.out.println("Positivo");

        sc.close();
    }
}