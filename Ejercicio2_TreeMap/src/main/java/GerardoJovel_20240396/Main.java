package GerardoJovel_20240396;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> cities = new TreeMap<>();

        cities.put("San Salvador", 30);
        cities.put("La Unión", 35);
        cities.put("San Miguel", 33);
        cities.put("Ahuachapán", 28);
        cities.put("Chalatenango", 25);

        TreeMap<Integer, String> cities_rev = new TreeMap<>();

        System.out.println("Las ciudades son: ");
        for (String city : cities.keySet()) {
            System.out.println("-" + city);
            cities_rev.put(cities.get(city), city);
        }

        System.out.println("La ciudad más fría es: " + cities_rev.firstKey() + " " + cities_rev.get(cities_rev.firstKey()));
        System.out.println("La ciudad más cálida es: " + cities_rev.lastKey() + " " + cities_rev.get(cities_rev.lastKey()));
    }
}