package GerardoJovel_20240396;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> clients = new LinkedList<>();

        clients.add("Isaac");
        clients.add("Diego");
        clients.add("Edwin");

        System.out.println("Atendiendo al cliente: " + clients.getFirst());
        clients.removeFirst();

        System.out.println("Ingresando un cliente prioritario...");
        clients.add(0, "Gerardo");

        System.out.println("En la fila sigue: " + clients.getFirst());
    }
}