package GerardoJovel_20240396;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese un número:");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();
        int numInt = Integer.parseInt(num);
        if (numInt < 0) {
            System.out.println("El número es negativo");
        } else if (numInt == 0) {
            System.out.println("El número no es positivo o negativo");
        } else {
            System.out.println("El número es positivo");
        }

    }
}