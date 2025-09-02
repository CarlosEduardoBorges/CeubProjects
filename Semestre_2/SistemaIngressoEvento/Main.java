import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Ingresso> ingressos = new ArrayList<>();

        IngressoVIP vip = new IngressoVIP();
        vip.setValor(350.00);
        vip.setLocal("Arena Principal");
        vip.setData("01/09/2025");
        vip.setAreaVIP("Camarote Open Bar");
        ingressos.add(vip);

        IngressoEstudante estudante = new IngressoEstudante();
        estudante.setValor(120.00);
        estudante.setLocal("Pista Comum");
        estudante.setData("01/09/2025");
        estudante.setInstituicaoEnsino("Universidade Federal");
        ingressos.add(estudante);

        IngressoCortesia cortesia = new IngressoCortesia();
        cortesia.setValor(120.00); // Valor base, mas o final será zero
        cortesia.setLocal("Pista Comum");
        cortesia.setData("01/09/2025");
        cortesia.setPatrocinador("Empresa X");
        ingressos.add(cortesia);

        System.out.println("--- Detalhes dos Ingressos para o Evento ---");
        for (Ingresso ingresso : ingressos) {
            String tipoIngresso = ingresso.getClass().getSimpleName();

            System.out.printf("Tipo: %-17s | Local: %-15s | Valor Final: R$ %.2f%n",
                    tipoIngresso,
                    ingresso.getLocal(),
                    ingresso.calcularValorFinal());
        }
    }
}