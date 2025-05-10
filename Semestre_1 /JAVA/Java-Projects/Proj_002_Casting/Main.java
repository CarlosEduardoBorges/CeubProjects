// Nesse projeto estarei fazendo oque é chamado de casting

public class Main {
    public static void main(String[] args) {
        int x, y; // Aqui estou apenas declarando que X e Y serão do tipo Int

        x = 5; // Estou declarando o valor de X
        y = 2 * x; // Estou declarando o valor de Y. Também estou Y como 2x o valor de X que eu havia declarado

        // Caso eu decida declarar Y como do tipo Double. O valor sairá com uma casa decimal após o ponto flutuante

        System.out.println(x); // Estou "imprimindo" o valor de X no promt
        System.out.println(y); // Estou "imprimindo" o valor de Y no promt

        // Abaixo irei criar um algoritimo que me forneça o valor da área de um trapézio
        System.out.println(" ");
        System.out.println("Algorítimo para calcular a área de um trapézio");
        double _Area, _BaseMaior, _BaseMenor, _Altura;

        _BaseMaior = 10.0; // Sempre usar ".0" após o numero inteiro para identificar que é double
        // Caso seja float, use "f" após o numero inteiro
        _BaseMenor = 5.0;
        _Altura = 7.0;
        _Area = ((_BaseMaior + _BaseMenor) * _Altura) / 2;
        System.out.printf("O valor da área do trapézio é %.2f%n", _Area);
        System.out.println("");
        // Agora irei declarar um valor do tipo int e, ao dividi-lo, transforma-lo em double no resultado no promt
        int _10, _7;
        double _resultado;
        _10 = 10;
        _7 = 7;
        _resultado = (double) 10 / 7;
        // Se eu não declarar o tipo "double" depois da igualdade e ao lado da divisão, o compilador transformará o resultado da divisão, que veio de numeros do tipo int, em numeros inteiros
        // Se eu declarar o double após a igualdade, a divisão manterá as casas decimais depois da virgula
        System.out.printf("O valor é %.2f%n", _resultado);
        System.out.println(" ");
        // Agora irei transformar o valor de double para int
        int _resultado2;
        double _9;

        _9 = 9.8;
        _resultado2 = (int) _9; // Estou transformando um valor Double em Int
        // Preciso fazer essa declaração justamente para o sistema entender que não ligo de perder informações das casas decimais da virgula do tipo double
        System.out.printf("O valor é: %d%n", _resultado2);
    }
}