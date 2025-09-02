public class Carro extends Veiculo {

    private Integer quantidadePortas;

    @Override
    public Double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + 50;
    }
}
