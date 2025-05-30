package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese la nota del estudiante:");
        Scanner scan = new Scanner(System.in);

        int note = Integer.parseInt(scan.nextLine());

        if (note >= 7) {
            System.out.println("El estudiante aprobó");
        } else {
            System.out.println("El estudiante desaprobó");
        }

    }

}