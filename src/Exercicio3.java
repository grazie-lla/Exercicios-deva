import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o ano da missão:");
        short year = input.nextShort();

        System.out.println("Insira a quantidade de funcionários (máx 100):");
        byte employees = input.nextByte();

        System.out.println("Insira a distância do satélite da Terra (máx 2 milhões):");
        int  satelliteDistance = input.nextInt();

        System.out.println("Insira a velocidade máxima (máx 30.000km/h):");
        short speed = input.nextShort();

        System.out.println("A missão foi iniciada? Insira \"true\" para iniciada ou \"false\" para não iniciada:");
        boolean status = input.nextBoolean();

        System.out.println("Insira a distância que será percorrida em km (máx 3 bilhões de km):");
        long distanceTraveled = input.nextLong();

        System.out.println("Insira a calibragem das antenas:");
        double calibration = input.nextDouble();

        input.nextLine();

        System.out.printf("Ano da missão: %d;%nQuantidade de funcionários: %d;%nDistância do satélite da Terra: %d Km;%nVelocidade máxima: %d Km/H;%n", year, employees, satelliteDistance, speed);
        System.out.println("Estado da missão: " + (status ? "Iniciada" : "Não iniciada"));
        System.out.printf("Distância percorrida: %d Km;%nCalibragem das antenas: %.14f", distanceTraveled, calibration);
    }
}
