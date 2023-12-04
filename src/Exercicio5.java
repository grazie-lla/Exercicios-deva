import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu peso:");
        double weigth = input.nextDouble();

        System.out.println("Insira sua altura:");
        double heigth = input.nextDouble();

        double imc = weigth/Math.pow(heigth, 2);

        System.out.printf("Seu IMC é %.2f", imc);
    }
}
