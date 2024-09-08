public class ManipulacaoVetor {
    public static void main(String[] args) {
        // Declara e inicializa o vetor com 2 valores
        int[] vetor = {5, 10};

        // Exibe os valores iniciais
        System.out.println("Valores iniciais do vetor:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);

        // Troca os valores entre as duas posições
        int temp = vetor[0]; // Armazena o valor da posição 0 em uma variável temporária
        vetor[0] = vetor[1]; // Move o valor da posição 1 para a posição 0
        vetor[1] = temp;     // Move o valor armazenado na variável temporária para a posição 1

        // Exibe os valores após a troca
        System.out.println("\nValores após a troca:");
        System.out.println("Posição 0: " + vetor[0]);
        System.out.println("Posição 1: " + vetor[1]);
    }
}
