import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Animal> zoologico = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Max");
        cachorro1.setIdade(5);
        cachorro1.setPeso(15.5);
        cachorro1.setRaca("Golden Retriever");
        zoologico.add(cachorro1);

        Gato gato1 = new Gato();
        gato1.setNome("Mia");
        gato1.setIdade(3);
        gato1.setPeso(4.2);
        gato1.setCor("Branco");
        zoologico.add(gato1);

        Leao leao1 = new Leao();
        leao1.setNome("Simba");
        leao1.setIdade(8);
        leao1.setPeso(190.0);
        leao1.setTamanhoJuba(0.8);
        zoologico.add(leao1);

        System.out.println("--- Apresentação dos Animais do Zoológico ---");

        for (Animal animal : zoologico) {
            System.out.printf("Animal: %s | Som: %s | Alimentação: %s%n",
                    animal.getNome(),
                    animal.emitirSom(),
                    animal.alimentar());
        }
    }
}