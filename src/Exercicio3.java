import java.util.Scanner;

/*3 –
Crie um programa que solicite ao usuário quantos números ele deseja digitar.
Depois solicite ao usuário que digite todos os número.
Em seguida, solite ao usuário qual número ele quer procurar nos números digitados.
Depois, procuta pelo número digitado no array, contabilize cada vez que encontrar,
e finalmente exiba quantas vezes o número foi encontrado. */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja digitar? ");
        int quantidade = scanner.nextInt();
        int[] numeros = new int[quantidade];

        //Popular a lista numeros com os numeros desejados
        System.out.println("Digite os números que deseja: ");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }

        //Percorer a quantidade de numeros digitados para encontrar o numero solicitado
        System.out.println("Qual número deseja procurar? ");
        int numeroProcurado = scanner.nextInt();
        int contador = 0;

        //Contar quantas vezes o número aparece
        for (int i = 0; i < quantidade; i++) {
            if (numeros[i] == numeroProcurado) {
                contador++;
            }
        }
        System.out.println("O número " + numeroProcurado + " foi encontrado em um total de " + contador + "x.");
    }
}
