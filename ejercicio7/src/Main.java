import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        System.out.println("Años que has cumplido:");
        for (int i = 1; i <= edad; i++) {
            System.out.println(i);
        }
    }
}