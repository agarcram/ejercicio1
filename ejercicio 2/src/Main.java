import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el  primer numero");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el  segundo numero");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("El numero menor es " + num2);

        } else if (num1 == num2) {
            System.out.println("Los numeros sin iguales");

        } else {
            System.out.println("El numero menor es  " + num1);

        }
    }
}