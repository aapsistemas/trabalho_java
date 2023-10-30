
import java.util.Scanner;
public class salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de funcionários: ");
        int numFuncionarios = input.nextInt();

        double[] salarios = new double[numFuncionarios];

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.print("Informe o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = input.nextDouble();
        }

        double mediaSalarial = calcularMediaSalarial(salarios);

        System.out.println("A média salarial da empresa é: " + mediaSalarial);

        input.close();
    }

    public static double calcularMediaSalarial(double[] salarios) {
        if (salarios.length == 0) {
            return 0;
        }

        double somaSalarios = 0;

        for (double salario : salarios) {
            somaSalarios += salario;
        }

        return somaSalarios / salarios.length;
    }
}
