import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double _preco;
        String _desconto;

        System.out.println("Qual o preço do produto??");
        _preco = sc.nextDouble();



        _desconto = ( _preco > 100 ) ? "Vai ter frete grátis" : "Não vai ter frete grátis";

        System.out.println(_desconto);

        sc.close();
    }
}