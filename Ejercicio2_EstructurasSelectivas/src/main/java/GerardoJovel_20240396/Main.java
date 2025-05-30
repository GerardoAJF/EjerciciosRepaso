package GerardoJovel_20240396;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa un número:");

        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        int numInt = Integer.parseInt(num);
        System.out.println(numInt % 2 == 0 ? "El número es par" : "El número es impar");


    }
}