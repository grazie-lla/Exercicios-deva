import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String name = input.nextLine();

        System.out.print("Qual a sua idade?\n");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Qual a sua profissão?");
        String job = input.nextLine();

        System.out.printf("Nome: %s; %nIdade: %d %nProfissão: %s.", name, age, job);

    }

}
