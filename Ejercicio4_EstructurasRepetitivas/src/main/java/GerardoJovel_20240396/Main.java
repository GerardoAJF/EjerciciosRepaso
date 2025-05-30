package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counter = 0;
        int num = 0;
        do {

            System.out.println("Ingrese un número:");
            num = Integer.parseInt(scan.nextLine());
            counter += 1;
        } while (num != 0 );

        System.out.println("Ingresó " + counter + " números");
    }
}