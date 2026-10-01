package ru.university.laba3.primes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrimesGeneratorTest {

    public void run() {
        int n = 10;
        PrimesGenerator generator = new PrimesGenerator(n);

        List<Integer> primesList = new ArrayList<>();
        Iterator<Integer> it = generator.iterator();
        while (it.hasNext()) {
            primesList.add(it.next());
        }

        System.out.println("First " + n + " primes (forward):");
        System.out.println(primesList);

        Collections.reverse(primesList);
        System.out.println("Reverse order:");
        System.out.println(primesList);
    }
}