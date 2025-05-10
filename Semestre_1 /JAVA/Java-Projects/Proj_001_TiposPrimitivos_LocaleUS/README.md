```java
import java.util.Locale; // Importa a classe Locale para configurar o formato regional (ex: usar ponto como separador decimal)

public class Main {
    public static void main(String[] args) {

        // Declaração de variáveis do tipo String para armazenar nomes de produtos
        String _01Produto = "Computer";
        String _02Produto = "Office Desk";

        // Variáveis do tipo int para armazenar valores inteiros
        int _30 = 30;
        int _5290 = 5290;

        // Variável do tipo char para armazenar um único caractere
        char _F = 'F';

        // Variáveis do tipo double para armazenar números com ponto flutuante (precisão dupla)
        double _01Price = 2100.00;
        double _02Price = 650.50;
        double _Measure = 53.15616585;

        // Impressão de informações formatadas sobre os produtos
        System.out.println("Products:");
        System.out.printf("%s, which price is $%.2f%n", _01Produto, _01Price);
        System.out.printf("%s, which price is $%.2f%n", _02Produto, _02Price);

        System.out.println();

        // Impressão de um registro com idade, código e gênero
        System.out.printf("Record: %d years old, code %d and gender: %c%n", _30, _5290, _F);

        System.out.println();
        System.out.println();

        // Demonstração de formatação numérica com diferentes casas decimais
        System.out.printf("Measure with eight decimal places: %.8f%n", _Measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", _Measure);

        // Define o Locale para US, usando ponto como separador decimal
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", _Measure);

        // Exercício proposto pelo professor Nélio Alves no curso de Java da Udemy     
    }
}
```
