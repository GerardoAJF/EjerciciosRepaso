package GerardoJovel_20240396;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String option;

        do {
            System.out.println("Ingrese una opción del menú");
            System.out.println("1 - Hamburguesa");
            System.out.println("2 - Pizza");
            System.out.println("3 - Helado");
            System.out.println("4 - Salir");
            option = scan.nextLine();
        } while (!option.equals("4"));

        System.out.println("Un gusto, Adios!");
    }
}