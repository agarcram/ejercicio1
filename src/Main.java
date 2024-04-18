import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número al azar entre 1 y 1000:");
        int numeroCliente = scanner.nextInt();

        System.out.println("El número ingresado es: " + numeroCliente);


        if (numeroCliente == 1000){
            System.out.println("Ganaste un premio");
        }else {
            System.out.println("Sigue intentando");
        }

    }
}