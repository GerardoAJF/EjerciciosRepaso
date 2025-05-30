package GerardoJovel_20240396;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("hola");
        words.add("mundo");
        words.add("hola");
        words.add("java");

        Set<String> uniqueWords = new HashSet<>(words);

        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord.toUpperCase());
        }
    }
}