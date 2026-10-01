package ru.university.laba3.words;

import java.util.HashMap;
import java.util.Map;

public class Task04WordFrequency {

    public void run() {
        String text = "Hello world! Hello Java, hello world. Welcome to the java world.";

        String cleaned = text.toLowerCase().replaceAll("[^a-zA-Z ]", "");
        String[] words = cleaned.split("\\s+");

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                Integer old = wordCountMap.get(word);
                wordCountMap.put(word, old == null ? 1 : old + 1);
            }
        }

        System.out.println("Text: " + text);
        System.out.println();
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
    }
}