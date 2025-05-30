package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num1 = Integer.parseInt(scan.nextLine());

        System.out.println("Ingrese otro número:");
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println("Ingrese la operación que desea realizar");
        System.out.println("+");
        System.out.println("-");
        System.out.println("*");
        System.out.println("/");

        String operation = scan.nextLine();

        switch (operation) {
            case "+":
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case "-":
                System.out.println( "El resultado es: " + (num1 - num2));
                break;
            case "*":
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case "/":
                System.out.println("El resultado es: " + (num1 / num2));
                break;
            default:
                System.out.println("Esa operación no existe");
        }
    }
}