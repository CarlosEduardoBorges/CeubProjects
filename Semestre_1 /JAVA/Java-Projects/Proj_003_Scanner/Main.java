import java.util.Scanner; // Declarando que estarei usando o Scanner no pacote

public class Main {
    public static void main(String[] args) {
        // Vou declarar Scanner para tipo String
        Scanner sc = new Scanner(System.in); // Declarando que a variavel "sc" será do tipo de entrada ( Ou seja, vou digitar no promt )
        String x;
        x = sc.next(); // Declarando que a variavel "x" irá receber o comando de entrada
        System.out.printf("Você digitou: %s%n", x);


        Scanner inteiro = new Scanner(System.in);
        int y;
        y = inteiro.nextInt(); // Declarando que o comando de entrada deverá reconhecer o tipo int
        System.out.println(y);

        sc.close(); // Declarando que o comando de entrada string acabará aqui
        inteiro.close(); // Declarando que o comando de entrada inteiro acabará aqui
        // ".nextDouble();" é para reconhecer do tipo double
        // ".next().charAt(0);" é para reconhecer do tipo char
    }
}