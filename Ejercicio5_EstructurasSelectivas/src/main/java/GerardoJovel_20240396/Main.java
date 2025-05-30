package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el dia de la semana:");
        Scanner scan = new Scanner(System.in);

        int day = Integer.parseInt(scan.nextLine());

        switch (day) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miércoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sábado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("Número de dia no válido");
        }
    }
}