import java.util.Scanner;

/* 1 – Crie um programa que solicite ao usuário quantos números ele deseja digitar.
Depois solicite ao usuário que digite todos os número,
 e finalmente exiba todos os números que o usuário digitou na ordem inversa ao digitado*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite quantos números deseja digitar: ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        //Popular o array com números digitados
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        //Mostrar os números em ordem inversa
        System.out.println("Os números inversos são: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

    }
}

