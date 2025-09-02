import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        List<Veiculo> frota = new ArrayList<>();

        // Criando e configurando um Carro
        Carro carro1 = new Carro();
        carro1.setModelo("Civic");
        carro1.setMarca("Honda");
        carro1.setPlaca("ABC-1A23");
        carro1.setValorDiaria(180.00);
        frota.add(carro1);

        // Criando e configurando uma Moto
        Moto moto1 = new Moto();
        moto1.setModelo("XRE 300");
        moto1.setMarca("Honda");
        moto1.setPlaca("DEF-4B56");
        moto1.setValorDiaria(110.00);
        frota.add(moto1);

        // Criando e configurando um Caminhão
        Caminhao caminhao1 = new Caminhao();
        caminhao1.setModelo("Scania R450");
        caminhao1.setMarca("Scania");
        caminhao1.setPlaca("GHI-7C89");
        caminhao1.setValorDiaria(600.00);
        frota.add(caminhao1);


        int diasParaAluguel = 7;

        System.out.println("--- CÁLCULO DE ALUGUEL DA FROTA (" + diasParaAluguel + " dias) ---");


        for (Veiculo veiculo : frota) {

            Double valorTotal = veiculo.calcularAluguel(diasParaAluguel);

            System.out.printf("Veículo: %s | Placa: %s | Valor do Aluguel: R$ %.2f%n",
                    veiculo.getModelo(),
                    veiculo.getPlaca(),
                    valorTotal);
        }
    }
}