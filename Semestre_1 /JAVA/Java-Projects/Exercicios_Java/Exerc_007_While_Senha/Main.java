import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int _senha = 0;
        boolean _Verificador = false;

        while (_senha != 2002) {
            _senha = sc.nextInt();
            if (_senha == 2002) {
                _Verificador = true;
                System.out.println("Senha Correta");
            } else System.out.println("Senha Inválida");
        }

        if (_Verificador == true) {
            System.out.println("CONTINUAÇÃO....");
        }
        sc.close();
    }
}