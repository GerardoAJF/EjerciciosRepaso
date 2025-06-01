package GerardoJovel_20240396;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Puertas");
        playlist.add("Ganaron los malos");
        playlist.add("Esplín");
        playlist.add("En el cuarto de Nico");
        playlist.add("Cara de nada");
        playlist.add("El astrónomo que no podía ver al cielo");
        playlist.add("El perro de Alcibíades");
        playlist.add("Camello patagónico");
        playlist.add("Pixel Pig");
        playlist.add("Don't Leave");

        playlist.addLast("Snowfall");
        playlist.addLast("Apathy");
        playlist.addLast("NCS Dream");

        playlist.addFirst("Reproducción siguiente");

        playlist.removeLast();

        for (String song : playlist) {
            System.out.println("-" + song);
        }

    }
}