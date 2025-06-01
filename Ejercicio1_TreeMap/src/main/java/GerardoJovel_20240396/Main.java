package GerardoJovel_20240396;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Double> products = new TreeMap<>();

        products.put("Carne", 5.99);
        products.put("Laptop", 150.66);
        products.put("Leche", 1.50);

        TreeMap<Double, String> products_rev = new TreeMap<>();

        System.out.println("Los productos son:");
        for (String product : products.keySet()) {
            System.out.println("-" + product);
            products_rev.put(products.get(product), product);
        }

        System.out.println("El precio de la leche es: " + products.get("Leche"));

        System.out.println("El producto más barato es: " + products_rev.get(products_rev.firstKey()));
        System.out.println("El producto más caro es: " + products_rev.get(products_rev.lastKey()));

    }
}