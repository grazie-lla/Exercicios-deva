import java.util.Scanner;

public class ExercicioExtra {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do aluno de 0 a 100:");

        int nota = input.nextInt();
        char grade;

        switch (nota / 10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            default:
                grade = 'Z';
                break;
        }

        System.out.println("Grade: " + grade);
    }
}