/*9 - Faça um programa em Java que receba o total das vendas de cada vendedor e armazene­as em um vetor.
 Receba também o percentual de comissão de cada vendedor e armazene­os em outro vetor.
  Receba os nomes desses vendedores e armazene­os em um terceiro vetor.
  Existem apenas dez vendedores. Calcule e mostre:
  a) Exercicio1 relatório com os nomes dos vendedores e os valores a receber;
  b) O total das vendas de todos os vendedores;
  c) O maior valor a receber e quem o receberá;
  d) O menor valor a receber e quem o receberá.
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vendedores = 2;
        double[] vendas = new double[vendedores];
        double[] comissao = new double[vendedores];
        String[] nomes = new String[vendedores];

        //Solicitando/Populando nome dos vendedores + quantidade de vendas + comissao
        System.out.println("Preencha os dados do sistema. ");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome do vendedor " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            System.out.print("Quantidade de vendas em R$: ");
            vendas[i] = scanner.nextInt();
            System.out.print("Quantidade de comissão em %: ");
            comissao[i] = scanner.nextInt();
        }

        //Calculo de comissao
        double[] valorComissao = new double[vendedores];
        for (int i = 0; i < vendedores; i++) {
            valorComissao[i] = (vendas[i] * comissao[i]) / 100;
        }

        //Soma de total de vendas de todos vendedores
        double somaTotalVendas = 0;
        for (int i = 0; i < nomes.length; i++) {
            somaTotalVendas += vendas[i];
        }
        System.out.println("O total de vendas entre todos vendedores foi de: " + somaTotalVendas + "R$.");


        //Percorrer array para exibir relatório de todas as vendas, vendedores e comissoes
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Vendedor " + (i + 1) + ", ");
            System.out.print(nomes[i]);
            System.out.print(", vendeu ");
            System.out.print(vendas[i] + "R$");
            System.out.print(", o valor a receber de comissão é de ");
            System.out.println(valorComissao[i] + "R$.");
        }

        //Maior valor a receber e quem receberá
        double maiorValor = valorComissao[0];
        String vendedorMaiorValor = nomes[0];
        for (int i = 0; i < nomes.length; i++) {
            if (valorComissao[i] > maiorValor) {
                maiorValor = valorComissao[i];
                vendedorMaiorValor = nomes[i];
            }
        }
        System.out.println("O maior valor recebido foi de: " + maiorValor + "R$ pelo vendedor " + vendedorMaiorValor + ".");

        //Menor valor a receber e quem o receberá
        double menorValor = valorComissao[0];
        String vendedorMenorValor = nomes[0];
        for (int i = 0; i < nomes.length; i++) {
            if (valorComissao[i] < menorValor) {
                menorValor = valorComissao[i];
                vendedorMenorValor = nomes[i];
            }
        }
        System.out.println("O menor valor recebido foi de: " + menorValor + "R$ pelo vendedor " + vendedorMenorValor + ".");
    }
}
