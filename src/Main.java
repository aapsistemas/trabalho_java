import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius:");
        double celsius = input.nextDouble();
        exibirTemperaturas(celsius);
    }
    public static void exibirTemperaturas(double celsius) {
        double kelvin = celsius + 273.15;
        double reaumur = celsius * 0.8;
        double rankine = celsius * 1.8 + 32 + 459.67;
        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
        System.out.println("Temperatura em Réaumur: " + reaumur + " Re");
        System.out.println("Temperatura em Rankine: " + rankine + " Ra");
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " F");
    }
}