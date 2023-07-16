import java.util.Scanner;

/*Crie um programa que peça pro usuário informar a temperatura do ambiente das últimas 8 horas.
 Depois de informado, calcule a temperatura média
 e procura pela maior e menor temperatuas.
 Depois exiba a menor temperatura, a média e maior temperatura.*/

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeDeHoras = 8;
        double[] temperaturas = new double[quantidadeDeHoras];

        //Populando cada hora com a temperatura
        System.out.print("Informe a temperatura ambiente das últimas 8 horas em ºC: ");
        for (int i = 0; i < quantidadeDeHoras; i++) {
            temperaturas[i] = scanner.nextInt();
        }

        //Somando as temperaturas e calculando a média
        double somaDasTemperatuas = 0;
        for (int i = 0; i < quantidadeDeHoras; i++) {
            somaDasTemperatuas += temperaturas[i];
        }
        System.out.println("A temperatura média é de: " + (somaDasTemperatuas / quantidadeDeHoras) + "ºC");

        //Procurando a menor temperatura
        double menorTemperatura = temperaturas[0];
        for (int i = 0; i < quantidadeDeHoras; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        System.out.println("A menor temperatura foi: " + menorTemperatura + "ºC");

        //Procurando a maior temperatura
        double maiorTemperatura = temperaturas[0];
        for (int i = 0; i < quantidadeDeHoras; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }
        System.out.println("A maior temperatura foi: " + maiorTemperatura + "ºC");
    }

}

