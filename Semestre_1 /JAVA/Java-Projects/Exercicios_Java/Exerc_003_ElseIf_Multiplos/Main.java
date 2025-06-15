import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();

        if (A != 0 && B != 0 && (A % B == 0 || B % A == 0)) System.out.println("Multiplos");
        else if (A == 0) System.out.println("ERROR!!!");
        else if (B == 0) {
            System.out.println("ERROR!!!");
        } else System.out.println("Não Multiplos");

        sc.close();
    }
}