import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double _Plano = 50;
        double _Tempo, _TempoRestante;
        boolean _Conferido = true;

        System.out.println("DIGITE O TEMPO EM MINUTOS");
        _Tempo = sc.nextDouble();

        if (_Tempo < 0) {
            _Conferido = false;
        } else if (_Tempo >= 0.1 && _Tempo < 100 ) {
            System.out.println("ESTÁ DENTRO DOS LIMITES DO PLANO");
        } else if (_Tempo > 100) {
            _Tempo -= 100;
            _TempoRestante = _Tempo * 2.00;
            _Plano += _TempoRestante;
            System.out.printf("VOCÊ ULTRAPASSOU %.2f MIN DO LIMITE DO PLANO, LOGO PAGARÁ: R$%.2f DE ACRÉSCIMO.%n", _Tempo, _TempoRestante);
            System.out.printf("LOGO, TOTALIZANDO: R$%.2f", _Plano);

        }

        if (_Conferido == false) {
            System.out.println("TEMPO INVALIDO");
        }

    }
}