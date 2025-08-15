import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double c, f, k;
        String entrada;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius para ser convertida: ");
        entrada = sc.nextLine();

        if (!entrada.isEmpty()){
            c = Double.parseDouble(entrada);
            f = c * (9 / 5) + 32;
            k = c + 273.15;
            System.out.println("Conversão para Fahrenheit: "+ f);
            System.out.println("Conversão para Kelvin: "+ k);
        }else{
            System.out.println("Não da para calcular sem um valor né ?!");
        }
        sc.close();
    }
}