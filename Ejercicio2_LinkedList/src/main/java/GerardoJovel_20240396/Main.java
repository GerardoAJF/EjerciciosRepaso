package GerardoJovel_20240396;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> historial = new LinkedList<>();

        historial.add("www.teams.com");
        historial.add("www.netacad.com");
        historial.add("www.youtube.com");
        historial.add("www.minecraft.net");
        historial.add("www.stackoverflow.com");

        System.out.println("Regresando una página del historial atrás...");
        historial.removeLast();

        System.out.println("Imprimiendo historial actual");
        for (String page : historial) {
            System.out.println("-" + page);
        }
    }
}