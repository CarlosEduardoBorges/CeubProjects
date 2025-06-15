import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int totalAlcool = 0;
        int totalGasolina = 0;
        int totalDiesel = 0;
        int escolha;

        
        System.out.println("QUAL COMBUSTÍVEL DESEJA REGISTRAR?");
        System.out.println("------------------------------------");
        System.out.println("[1] ÁLCOOL");
        System.out.println("[2] GASOLINA");
        System.out.println("[3] DIESEL");
        System.out.println("[4] FINALIZAR E VER O TOTAL");
        System.out.println("------------------------------------");
        System.out.print("Sua opção: ");
        
        escolha = sc.nextInt();
        
        while (escolha != 4) {

            if (escolha == 1) {
                totalAlcool++;
                System.out.println(">> Abastecimento de ÁLCOOL registrado!");
            } else if (escolha == 2) {
                totalGasolina++;
                System.out.println(">> Abastecimento de GASOLINA registrado!");
            } else if (escolha == 3) {
                totalDiesel++;
                System.out.println(">> Abastecimento de DIESEL registrado!");
            } else if (escolha == 4) {
                System.out.println(">> Fim");
            } else {
                // Qualquer número que não seja 1, 2, 3
                // cairá aqui.
                System.out.println(">> OPÇÃO INVÁLIDA. Tente novamente.");
            }

            // Exibimos o menu novamente e lemos a próxima escolha para
            // decidir se o loop continua ou para na próxima verificação.
            System.out.println("\nQUAL COMBUSTÍVEL DESEJA REGISTRAR?");
            System.out.println("------------------------------------");
            System.out.println("[1] ÁLCOOL | [2] GASOLINA | [3] DIESEL | [4] FINALIZAR");
            System.out.print("Sua opção: ");
            escolha = sc.nextInt();
        }

        // Esta parte do código só é executada quando o loop termina (escolha == 4)
        System.out.println("\nPROGRAMA FINALIZADO.");
        System.out.println("\n--- RELATÓRIO DE ABASTECIMENTOS ---");
        System.out.printf("Álcool:   %d vez(es)%n", totalAlcool);
        System.out.printf("Gasolina: %d vez(es)%n", totalGasolina);
        System.out.printf("Diesel:   %d vez(es)%n", totalDiesel);
        System.out.println("-------------------------------------");

        int totalGeral = totalAlcool + totalGasolina + totalDiesel;
        System.out.printf("TOTAL GERAL: %d abastecimento(s)%n", totalGeral);

        sc.close();
    }
}