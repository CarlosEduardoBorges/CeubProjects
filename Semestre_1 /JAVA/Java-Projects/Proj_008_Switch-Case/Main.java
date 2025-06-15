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

        int _Pedido, _Valor = 0, _Quantidade;
        double _PrecoFinal;
        String _item = "";
        boolean _Verificador = false;

        _Pedido = sc.nextInt();

        if (_Pedido < 1 || _Pedido > 5) {
            System.out.println("NÚMERO INVALIDO");
        } else {
            _Verificador = true;
        }

        if (_Verificador) {
            switch (_Pedido) {
                case 1:
                    _item = "CACHORRO QUENTE";
                    _Valor = 400;
                    break;
                case 2:
                    _item = "X-SALADA";
                    _Valor = 450;
                    break;
                case 3:
                    _item = "X-BACON";
                    _Valor = 500;
                    break;
                case 4:
                    _item = "TORRADA SIMPLES";
                    _Valor = 200;
                    break;
                case 5:
                    _item = "REFRIGERANTE";
                    _Valor = 150;
                    break;
            }
            _PrecoFinal = _Valor / 100.0;

            System.out.printf("Quantos irá querer??");
            _Quantidade = sc.nextInt();
            _PrecoFinal *= _Quantidade;

            System.out.printf("Seu %s acabou de sair, ficou por volta de R$%.2f%n", _item, _PrecoFinal);
        }

        sc.close();
    }
}
