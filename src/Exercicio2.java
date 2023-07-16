import java.util.Scanner;

/*
2 - Crie um programa que solicite ao usuário a quantidade de alunos de uma turma.
Em seguida, crie um array para armazenar as notas dos alunos.
O programa lê as notas de cada aluno e as armazena no array.
 Em seguida, calcule a média das notas, somando todas as notas do array e dividindo pelo número total de alunos.
 Por fim, exiba a média das notas da turma.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de alunos da turma: ");
        int quantidade = scanner.nextInt();

        double[] nota = new double[quantidade];

        //Popular o array com as notas
        for (int i=0; i < quantidade; i++) {
            System.out.print("Nota do aluno " + (i+1) + " = ");
            nota[i] = scanner.nextDouble();
        }

        //Somar todos os números(notas) de dentro do array
        double somaNotas = 0;
        for (int i = 0 ; i < quantidade ; i++) {
            somaNotas += nota[i];
        }

        System.out.println("A média ta turma é: " + (somaNotas/quantidade));

    }
}
