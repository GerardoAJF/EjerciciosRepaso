package GerardoJovel_20240396;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password;
        do {

            System.out.println("Ingrese la contraseña correcta:");
            password = scan.nextLine();

        } while (!password.equals("1234"));

        System.out.println("Bienvenido al sistema");
    }
}