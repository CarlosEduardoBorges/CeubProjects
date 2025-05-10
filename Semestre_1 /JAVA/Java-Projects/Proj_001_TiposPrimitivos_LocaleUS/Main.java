import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String _01Produto = "Computer"; // Usando a String, consigo armazenar nomes ( É preciso usar "" em sua declaração)
        String _02Produto = "Office Desk";

        int _30 = 30; // Com Int, consigo declarar numeros inteiros
        int _5290 = 5290;
        char _F = 'F'; // Com Char, consigo declarar letras

        double _01Price = 2100.00; // Consigo usar numeros flutuantes. Geralmente, double é o mais usado
        double _02Price = 650.50;
        double _Measure = 53.15616585;

        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", _01Produto, _01Price); // Usando %x consigo puxar alguma variavel para dentro do texto
        System.out.printf("%s, which price is $%.2f%n", _02Produto, _02Price);
        System.out.println("  ");
        System.out.printf("Record: %d years old, code %d and gender: " + _F, _30, _5290);
        System.out.println("  ");
        System.out.println("  ");
        System.out.printf("Measure with eight decimal places: %.8f%n", _Measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", _Measure);
        Locale.setDefault(Locale.US); // Fazendo isso, transformo a virgula em ponto nos numeros flutuantes
        System.out.printf("US decimal point: %.3f%n", _Measure);

    }
}