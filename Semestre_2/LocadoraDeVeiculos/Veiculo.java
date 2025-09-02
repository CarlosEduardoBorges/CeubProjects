
public abstract class Veiculo {
    private String modelo;
    private String marca;
    private Integer ano;
    private Double valorDiaria;
    public String placa;

    // SETTERS


    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    // GETTERS


    public Double getValorDiaria() {
        return valorDiaria;
    }

    public Integer getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    // MÉTODOS
    public abstract Double calcularAluguel(int dias);
}
