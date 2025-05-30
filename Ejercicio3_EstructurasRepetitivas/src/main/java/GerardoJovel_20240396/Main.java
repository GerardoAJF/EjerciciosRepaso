package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el número del que  quiere sacar la tabla: ");

        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= 12; i ++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}