package GerardoJovel_20240396;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> players = new TreeMap<>();

        players.put("van Dijk", 89);
        players.put("Cristiano Ronaldo", 86);
        players.put("Mbappé", 91);
        players.put("Messi", 99);
        players.put("Raphinha", 84);

        int max_score = 0;
        String max_player = "";

        System.out.println("Los jugadores son: ");
        for (String player : players.keySet()) {

            // Actualizamos el jugador con el mejor puntaje
            if (players.get(player) > max_score) {
                max_score = players.get(player);
                max_player = player;
            }

            System.out.println("-" + player);
        }

        System.out.println("El jugador con el mejor puntaje es: " + max_player + ", con un puntaje total de: " + max_score);

    }
}