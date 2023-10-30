import java.util.Scanner;
public class azulejos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicite ao usuário as dimensões da parede e dos azulejos
        System.out.print("Informe a altura da parede (hp): ");
        double hp = input.nextDouble();
        System.out.print("Informe a largura da parede (lp): ");
        double lp = input.nextDouble();
        System.out.print("Informe a altura do azulejo (ha): ");
        double ha = input.nextDouble();
        System.out.print("Informe a largura do azulejo (la): ");
        double la = input.nextDouble();

        // Chamada da função para calcular a quantidade de azulejos
        int quantidadeAzulejos = calcularQuantidadeAzulejos(hp, lp, ha, la);

        // Exiba o resultado
        System.out.println("Serão necessários " + quantidadeAzulejos + " azulejos para cobrir a parede.");

        input.close();
    }

    public static int calcularQuantidadeAzulejos(double hp, double lp, double ha, double la) {
        double areaParede = hp * lp;
        double areaAzulejo = ha * la;
        int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo); // Arredonda para cima
        return quantidadeAzulejos;
    }
}
