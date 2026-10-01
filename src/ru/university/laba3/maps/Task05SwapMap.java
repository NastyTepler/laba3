package ru.university.laba3.maps;

import java.util.HashMap;
import java.util.Map;

public class Task05SwapMap {

    public void run() {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        System.out.println("Source map: " + map);

        Map<Integer, String> swapped = swap(map);
        System.out.println("Swapped map: " + swapped);
    }

    public <K, V> Map<V, K> swap(Map<K, V> map) {
        Map<V, K> result = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }
        return result;
    }
}