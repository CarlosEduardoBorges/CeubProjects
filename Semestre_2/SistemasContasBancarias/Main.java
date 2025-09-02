import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Conta> contas = new ArrayList<>();

        ContaCorrente cc = new ContaCorrente();
        cc.setTitular("João Silva");
        cc.setSaldo(1500.00);
        contas.add(cc);

        ContaPoupanca cp = new ContaPoupanca();
        cp.setTitular("Maria Souza");
        cp.setSaldo(3000.00);
        contas.add(cp);

        ContaSalario cs = new ContaSalario();
        cs.setTitular("Carlos Pereira");
        cs.setSaldo(2500.00);
        contas.add(cs);

        System.out.println("--- Realizando Operações ---");
        cc.depositar(500.00);
        cp.sacar(200.00);
        cs.sacar(1200.00);
        cs.sacar(900.00); // Saque válido

        System.out.println("\n--- Saldo Final das Contas ---");
        for (Conta conta : contas) {
            double saldoFinal = conta.calcularSaldoFinal();
            System.out.printf("Titular: %-15s | Saldo Atual: R$ %-10.2f | Saldo Final: R$ %.2f%n",
                    conta.getTitular(),
                    conta.getSaldo(),
                    saldoFinal);
        }
    }
}