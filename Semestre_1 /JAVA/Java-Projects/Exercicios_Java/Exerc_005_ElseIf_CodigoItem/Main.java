import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println(" - ITENS ABAIXO CONTENDO SEU PREÇO - ");
        System.out.println(" - 1 | CACHORRO QUENTE | R$4.00 - ");
        System.out.println(" - 2 | X-SALADA | R$4.50 - ");
        System.out.println(" - 3 | X-BACON | R$5.00 - ");
        System.out.println(" - 4 | TORRADA SIMPLES | R$2.00 - ");
        System.out.println(" - 5 | REFRIGERANTE | R$1.50 - ");
        System.out.println();

        int _Item, _Quantidade;
        double _ValorFinal, _Valor;

        System.out.println("QUAL DESSES VOCÊ VAI QUERER?");
        _Item = sc.nextInt();

        if ( _Item == 1 ) {
            System.out.println("QUANTOS CACHORRO QUENTE IRÁ QUERER?");
            _Valor = 4.00;
        } else if ( _Item == 2 ) {
            System.out.println("QUANTOS X-SALADA IRÁ QUERER?");
            _Valor = 4.50;
        } else if ( _Item == 3 ) {
            System.out.println("QUANTOS X-BACON IRÁ QUERER?");
            _Valor = 5.00;
        } else if ( _Item == 4 ) {
            System.out.println("QUANTAS TORRADAS SIMPLES IRÁ QUERER?");
            _Valor = 2.00;
        } else if ( _Item == 5 ) {
            System.out.println("QUANTOS REFRIGERANTES IRÁ QUERER?");
            _Valor = 1.00;
        } else {
            System.out.println("NÚMERO DO PEDIDO ERRADO");
            return;
        }

        _Quantidade = sc.nextInt();

        _ValorFinal = _Quantidade * _Valor;
        System.out.printf("O PEDIDO DEU %.2f", _ValorFinal);

    }
}