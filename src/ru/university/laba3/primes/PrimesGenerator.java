package ru.university.laba3.primes;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PrimesGenerator implements Iterable<Integer> {
    private final int count;

    public PrimesGenerator(int count) {
        this.count = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int generatedCount = 0;
            private int currentNumber = 2;

            @Override
            public boolean hasNext() {
                return generatedCount < count;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new NoSuchElementException();
                while (!isPrime(currentNumber)) {
                    currentNumber++;
                }
                generatedCount++;
                return currentNumber++;
            }
        };
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}