package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un la cantidad de números naturales a sumar:");

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        if (num <= 0) {
            System.out.println("La cantidad de números a sumar tiene que ser mayor a 0");
            return;
        }

        int total = 0;
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            total += i;
        }

        System.out.println("El total es: " + total);
    }
}