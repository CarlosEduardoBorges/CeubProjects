public class Caminhao extends Veiculo{
    private Double capacidadeCarga;

    @Override
    public Double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) + 200;
    }
}
