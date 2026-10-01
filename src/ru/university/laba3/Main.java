package ru.university.laba3;

import java.util.Scanner;
import ru.university.laba3.collections.Task01Collections;
import ru.university.laba3.primes.PrimesGeneratorTest;
import ru.university.laba3.humans.Task03Humans;
import ru.university.laba3.words.Task04WordFrequency;
import ru.university.laba3.maps.Task05SwapMap;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            printMenu();

            System.out.print("Enter number: ");
            if (!sc.hasNextInt()) {
                System.out.println("Not a number, try again");
                sc.nextLine();
                choice = -1;
            } else {
                choice = sc.nextInt();
                sc.nextLine();
            }

            switch (choice) {
                case 1 -> new Task01Collections().run();
                case 2 -> new PrimesGeneratorTest().run();
                case 3 -> new Task03Humans().run();
                case 4 -> new Task04WordFrequency().run();
                case 5 -> new Task05SwapMap().run();
                case 0 -> System.out.println("Exit");
                default -> System.out.println("No such option: " + choice);
            }

            System.out.println();
        } while (choice != 0);

        sc.close();
    }

    private static void printMenu() {
        System.out.println("Lab 3: Collections in Java");
        System.out.println("1 - Task 1: Collections methods");
        System.out.println("2 - Task 2: Prime numbers generator");
        System.out.println("3 - Task 3: Sets and comparison");
        System.out.println("4 - Task 4: Word frequency");
        System.out.println("5 - Task 5: Swap keys and values");
        System.out.println("0 - Exit");
    }
}