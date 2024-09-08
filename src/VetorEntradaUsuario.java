import java.util.Scanner;

public class VetorEntradaUsuario {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara um vetor de inteiros com 3 posições
        int[] vetor = new int[3];

        // Pede ao usuário que insira três números
        System.out.println("Por favor, insira três números inteiros:");

        // Lê os valores e armazena no vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        // Fecha o scanner
        scanner.close();

        // Exibe os valores inseridos
        System.out.println("\nValores inseridos:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }

        // Calcula a média dos valores
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        double media = (double) soma / vetor.length;

        // Exibe a média
        System.out.println("\nA média dos valores é: " + media);
    }
}
