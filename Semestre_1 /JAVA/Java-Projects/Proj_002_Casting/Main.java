// Exemplo de projeto que demonstra o conceito de casting (conversão de tipos)

public class Main {
    public static void main(String[] args) {

        // Declaração de variáveis inteiras
        int x, y;

        x = 5; // Atribuição de valor à variável x
        y = 2 * x; // y recebe o dobro de x

        // Impressão dos valores de x e y no console
        System.out.println(x);
        System.out.println(y);

        // Cálculo da área de um trapézio usando variáveis do tipo double
        System.out.println(" ");
        System.out.println("Algoritmo para calcular a área de um trapézio");
        double _Area, _BaseMaior, _BaseMenor, _Altura;

        // Atribuições com ponto flutuante (formato double)
        _BaseMaior = 10.0;
        _BaseMenor = 5.0;
        _Altura = 7.0;

        // Fórmula da área do trapézio: ((base maior + base menor) * altura) / 2
        _Area = ((_BaseMaior + _BaseMenor) * _Altura) / 2;
        System.out.printf("O valor da área do trapézio é %.2f%n", _Area);

        System.out.println();

        // Exemplo de casting explícito: int → double
        int _10, _7;
        double _resultado;

        _10 = 10;
        _7 = 7;

        // Conversão explícita para evitar truncamento do resultado da divisão
        _resultado = (double) _10 / _7;
        System.out.printf("O valor é %.2f%n", _resultado);

        System.out.println();

        // Exemplo de casting de double para int
        int _resultado2;
        double _9;

        _9 = 9.8;

        // Casting explícito de double para int (perde a parte decimal)
        _resultado2 = (int) _9;
        System.out.printf("O valor é: %d%n", _resultado2);
    }
}
