import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y;
        Y = sc.nextInt();

        if (Y < 12) System.out.println("Bom dia");
        else if (Y >= 12 && Y < 18) {
            System.out.println("Boa Tarde");
        } else System.out.println("Boa noite");


        sc.close();
    }
}