import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número da figura geométrica: 1-Retângulo, 2-Triângulo, 3-Círculo e 4-Trapézio");
        int figure = input.nextInt();
        double area = 0;

        switch (figure){
            case 1:
                System.out.println("Insira a base do retângulo:");
                double base = input.nextDouble();
                System.out.println("Insira a altura do retângulo:");
                double heigth = input.nextDouble();
                area = base * heigth;
                break;
            case 2:
                System.out.println("Insira a base do Triângulo:");
                base = input.nextDouble();
                System.out.println("Insira a altura do Triângulo:");
                heigth = input.nextDouble();
                area = (base * heigth)/2;
                break;
            case 3:
                System.out.println("Insira o raio do Círculo:");
                double radius = input.nextDouble();
                area = Math.PI*Math.pow(radius,2);
                break;
            case 4:
                System.out.println("Insira a base maior do Trapézio:");
                double largerBase = input.nextDouble();
                System.out.println("Insira a base menor do Trapézio:");
                double smallerBase = input.nextDouble();
                System.out.println("Insira a altura do Trapézio:");
                heigth = input.nextDouble();
                area = (largerBase+smallerBase)*heigth/2;
                break;
            default:
                System.out.println("A opção escolhida é inválida!");
        }
        System.out.printf("Área = %.2f", area);
    }
}
