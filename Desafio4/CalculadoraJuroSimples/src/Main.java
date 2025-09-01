import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // entrada de dados
        System.out.print("Digite o capital inicial: ");
        double c = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (em %): ");
        double i = sc.nextDouble() / 100; // converte para decimal

        System.out.print("Digite o tempo em meses: ");
        int t = sc.nextInt();

        // calculo dos juros
        double j = c * i * t;
        double montante = c + j;

        // formatação da saida
        System.out.printf("Juros acumulados: R$ %.2f%n", j);
        System.out.printf("Montante final após %d meses: R$ %.2f%n", t, montante);

        sc.close();
    }
}