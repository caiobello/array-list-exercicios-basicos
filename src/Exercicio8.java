/*8 - Faça um programa em Java que leia um vetor de 15 posições de números inteiros
 e multiplique todos os elementos pelo maior valor do vetor.
 Mostre o vetor após os cálculos.
 */
public class Exercicio8 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //Procurando maior valor do vetor
        int maiorValorDoVetor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValorDoVetor) {
                maiorValorDoVetor = vetor[i];
            }
        }
        System.out.println("A multiplicação de todos os elementos pelo maior valor do vetor:");
        for (int i=0; i<vetor.length; i++) {
            System.out.print(maiorValorDoVetor*vetor[i] + " ");
        }

    }
}
