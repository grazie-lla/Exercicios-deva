import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String name = input.nextLine();

        System.out.println("Qual a sua idade?");
        int age = input.nextInt();

        System.out.println("Qual o seu salário?");
        double income = input.nextDouble();

        System.out.println("Qual a sua altura?");
        double height = input.nextDouble();

        input.nextLine();

        System.out.println("Qual seu o gênero?");
        String gender = input.nextLine();

        System.out.printf("Nome: %s; %nIdade: %d; %nSalário: %.2f; %nAltura: %.2f; %nGênero: %s.", name, age, income, height,gender);
    }
}
