package GerardoJovel_20240396;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> cities = new TreeMap<String, Integer>();

        cities.put("San Salvador", 30);
        cities.put("La Unión", 35);
        cities.put("San Miguel", 33);
        cities.put("Ahuachapán", 28);
        cities.put("Chalatenango", 25);

        System.out.println("Las ciudades son: ");
        for (city : cities)
    }
}