package ru.university.laba3.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Task01Collections {

    public void run() {
        int n = 15;
        Random random = new Random();

        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(21);
        }
        System.out.println("1. Source array: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("2. List: " + list);

        Collections.sort(list);
        System.out.println("3. Ascending: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("4. Descending: " + list);

        Collections.shuffle(list);
        System.out.println("5. Shuffled: " + list);

        Collections.rotate(list, 1);
        System.out.println("6. Rotated by 1: " + list);

        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("9. Array from list: " + Arrays.toString(newArray));

        List<Integer> uniqueList = new ArrayList<>();
        for (Integer num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        System.out.println("7. Unique only: " + uniqueList);

        List<Integer> duplicatesList = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1 && !duplicatesList.contains(num)) {
                duplicatesList.add(num);
            }
        }
        System.out.println("8. Duplicates only: " + duplicatesList);

        System.out.println("10. Frequency of each number:");
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer num : list) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("  Number " + entry.getKey()
                    + " occurs " + entry.getValue() + " time(s)");
        }
    }
}