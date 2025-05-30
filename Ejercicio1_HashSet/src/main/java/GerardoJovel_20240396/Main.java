package GerardoJovel_20240396;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> users = new HashSet<>();

        users.add("Abel");
        users.add("Gerardo");
        users.add("Camila");
        users.add("Joshua");
        users.add("Freddy");
        users.add("Abel");

        System.out.println("Existen " + users.size() + " usuarios únicos");

        System.out.println("El usuario Edwin " +
                (users.contains("Edwin") ? "Si" : "No") +
                " está en el conjunto");

        System.out.println("El usuario Camila " +
                (users.contains("Camila") ? "Si" : "No") +
                " está en el conjunto");
    }
}