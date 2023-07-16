import java.util.Scanner;

/*
* 10 - Crie um programa que pede um inteiro positivo para o usuário.
*  Em seguida, popule uma array com os números de Fibonacci,
*  na hora de somar com os termos anteriores, some com elementos anteriores do array.
*/

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Olá, usuário, digite um número inteiro para a sequencia Fibonnaci: ");
        int numeroInteiro = scanner.nextInt();

        int[] fibonacci = new int [numeroInteiro];

        //posições iniciais do fibonacci
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        //Percorrer e preencher os valores de fibonnaci
        for (int i =2; i < numeroInteiro; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        //Percorrer todos os valores para imprimi-los
        System.out.print("A sequencia fibonacci é: ");
        for (int i=1; i<numeroInteiro; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }
}
