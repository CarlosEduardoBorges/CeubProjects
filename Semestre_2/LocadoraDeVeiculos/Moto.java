class Moto extends Veiculo {
    private Integer cilindrada;

    @Override
    public Double calcularAluguel(int dias) {
        return (getValorDiaria() * dias) * 0.95;
    }
}
