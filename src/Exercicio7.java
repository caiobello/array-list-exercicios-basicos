/*
 * 7 - Crie um programa em Java que implemente a uniao.
 *  Ou seja,dois arrays de inteiros e crie um novo array contendo a união de v1 e v2.
 * Por exemplo, se v1 = {11, 13, 45, 7} e v2 = {24, 4, 16, 81, 10, 12}, v3 irá conter {11, 13, 45, 7, 24, 4, 16, 81, 10, 12}.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        int[] array3 = new int[array1.length + array2.length];

        int index = 0;
        //Colocando o Array1 dentro do Array3
        for (int i = 0; i < array1.length; i++) {
            array3[index] = array1[i];
            index++;
        }

        //Colocando o Array2 dentro do Array3
        for (int j = 0; j < array2.length; j++) {
            array3[index] = array2[j];
            index++;
        }

        System.out.println("A união dos arrays é: ");
        //Percorrendo o Array3 e imprimindo
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }


    }
}
