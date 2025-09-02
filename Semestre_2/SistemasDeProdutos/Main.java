import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Produto> carrinho = new ArrayList<>();

        ProdutoPerecivel iogurte = new ProdutoPerecivel();
        iogurte.setNome("Iogurte Grego");
        iogurte.setPrecoBase(8.50);
        iogurte.setDataValidade("10/10/2025");
        carrinho.add(iogurte);

        ProdutoImportado vinho = new ProdutoImportado();
        vinho.setNome("Vinho Chileno");
        vinho.setPrecoBase(70.00);
        vinho.setPaisOrigem("Chile");
        carrinho.add(vinho);

        ProdutoNacional arroz = new ProdutoNacional();
        arroz.setNome("Arroz Integral");
        arroz.setPrecoBase(25.00);
        arroz.setFabricante("Camil");
        carrinho.add(arroz);

        System.out.println("--- Preço Final dos Produtos no Carrinho ---");
        for (Produto produto : carrinho) {
            System.out.printf("Produto: %-18s | Preço Final: R$ %.2f%n",
                    produto.getNome(),
                    produto.calcularPrecoFinal());
        }
    }
}