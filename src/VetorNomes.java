import java.util.Scanner;

public class VetorNomes {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor de strings com 3 posições
        String[] nomes = new String[3];

        // Pede ao usuário que insira três nomes
        System.out.println("Por favor, insira três nomes:");

        // Lê os nomes e armazena no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Fecha o scanner
        scanner.close();

        // Exibe os nomes inseridos
        System.out.println("\nNomes inseridos:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}
