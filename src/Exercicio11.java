/*

/*
* 11 - Crie um programa que pede um inteiro positivo para o usuário.
*  Em seguida, popule uma array com os números de fatorial,
*  na hora de somar com os termos anteriores, some com elementos anteriores do array.
Fatorial de 0: 0! = '
Fatorial de 1: 1 x elemento0 = 1
Fatorial de 2: 2 x elemento1 = 2
Fatorial de 3: 3 x elemento2 = 3 x 2 = 6
...
Fatorial de n: n x elemento(n-1) = n x (n-1)! = n!*/


import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Declare um número para o Fatorial: ");
        int numeroFatorial = scanner.nextInt();
        int[] fatorial = new int[numeroFatorial];

        fatorial[0] = 1;
        //Populando o array fatorial[i]
        for (int i = 1; i < numeroFatorial; i++) {
            fatorial[i] = i * fatorial[i - 1];
        }

        //Imprimindo o array fatorial[]
        System.out.print("O array com o fatorial é: ");
        for (int i = 0; i < numeroFatorial; i++) {
            System.out.print(fatorial[i] + " ");
        }

    }
}
