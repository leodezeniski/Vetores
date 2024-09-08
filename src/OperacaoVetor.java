public class OperacaoVetor {
    public static void main(String[] args) {
        // Declara e inicializa o vetor com 4 valores
        int[] vetor = {3, 6, 9, 12};

        // Calcula a soma do primeiro e do último elemento
        int soma = vetor[0] + vetor[vetor.length - 1];

        // Exibe o resultado
        System.out.println("A soma do primeiro e último elemento é: " + soma);
    }
}
