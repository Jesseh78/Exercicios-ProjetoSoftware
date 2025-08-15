import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m, c, i;
        int t;

        System.out.println("Informe o valor de capital inicial: ");
        c = sc.nextDouble();

        System.out.println("informe o valor da taxa: ");
        i = sc.nextDouble();
        double taxa_percentual = i /100;

        System.out.println("informe o tempo em meses: ");
        t = sc.nextInt();

        m = c * Math.pow(1 + taxa_percentual, t); // função Math.pow calcula base^expoente
        System.out.printf("Montante final após %d meses: R$ %.2f%n", t, m);


        sc.close();
    }
}