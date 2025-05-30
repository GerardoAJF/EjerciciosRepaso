package GerardoJovel_20240396;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> codes = new HashSet<>();

        String code;

        do {
            System.out.println("Ingrese el código de barras");
            code = scan.nextLine();

            if (codes.contains(code)) {
                System.out.println("Ya registrado");
            } else {
                codes.add(code);
            }
        } while (!code.equals("0"));

        System.out.println("Existen estos " + codes.size() + " asistentes únicos");
    }
}