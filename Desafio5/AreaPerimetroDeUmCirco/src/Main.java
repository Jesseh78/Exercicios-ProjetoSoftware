import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // calculo
        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * Math.PI * raio;


        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Perímetro: %.2f%n", perimetro);

        scanner.close();
    }
}