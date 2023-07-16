import java.util.Scanner;
/*6 - Crie um array com 20 posições e um segundo array com 10.
 Peça para o usuário preencher os arrays com numeros que podem ser do tipo inteiro.
 Depois disso, extraia o conjunto (intersecção) entre os dois vetores.
*/

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] array1 = new int[5];
        int[] array2 = new int[5];

        System.out.println("Preencha o primeiro Array: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Preencha o segundo Array: ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = scanner.nextInt();
        }

        //intersecção entre dois arrays
        System.out.println("A intersecção entre os dois arrays é:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                }
            }
        }


    }
}
