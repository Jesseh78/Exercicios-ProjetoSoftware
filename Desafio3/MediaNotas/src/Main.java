import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Fazer um programa que calcule a média de um aluno.
        Scanner sc = new Scanner(System.in);

        // quantas notas serão calculadas
        System.out.print("Quantas notas deseja calcular? ");
        int quantidade_notas = sc.nextInt();

        double soma_notas = 0;

        // loop para ler cada nota
        for (int i = 1; i <= quantidade_notas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            soma_notas += nota;
        }
        // calculo de média

        double media = soma_notas / quantidade_notas;

        // exibe a nota formatando para no maximo duas casas depois da virgula
        System.out.printf("A média final do aluno é %.2f%n", media);

    }
}