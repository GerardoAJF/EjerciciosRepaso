package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el precio del producto:");
        Scanner scan = new Scanner(System.in);
        int price = Integer.parseInt(scan.nextLine());

        double descuent = 0;
        if (price > 200) {
            descuent = 0.20;
        } else if (price > 100) {
            descuent = 0.10;
        } else {
            descuent = 0.05;
        }

        System.out.println("El precio con descuento es: " + (price - (descuent * price)));
    }
}