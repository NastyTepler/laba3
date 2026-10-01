package ru.university.laba3.humans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание 3. Множества и сравнение объектов.
 *
 * Различия коллекций:
 * - HashSet       — не гарантирует порядок обхода, дубликаты отсекаются по equals/hashCode.
 * - LinkedHashSet — сохраняет порядок добавления элементов, дубликаты отсекаются.
 * - TreeSet       — сортирует элементы по compareTo (естественный порядок: возраст).
 * - TreeSet с компаратором по фамилии — сортирует по фамилии.
 *   Если фамилии совпадают, элементы считаются равными и второй отсекается!
 * - TreeSet с анонимным компаратором по возрасту — сортирует по возрасту.
 */
public class Task03Humans {

    public void run() {
        List<Human> humans = new ArrayList<>(Arrays.asList(
                new Human("Ivan",   "Ivanov",  25),
                new Human("Petr",   "Petrov",  30),
                new Human("Anna",   "Ivanova", 22),
                new Human("Alexey", "Ivanov",  40),
                new Human("Ivan",   "Ivanov",  25)   // дубликат
        ));
        System.out.println("1. Source list: " + humans);

        Set<Human> hashSet = new HashSet<>(humans);
        System.out.println("\n2. HashSet (random order, no duplicates):\n" + hashSet);

        Set<Human> linkedHashSet = new LinkedHashSet<>(humans);
        System.out.println("\n3. LinkedHashSet (insertion order kept):\n" + linkedHashSet);

        Set<Human> treeSet = new TreeSet<>(humans);
        System.out.println("\n4. TreeSet (natural order by age):\n" + treeSet);

        Set<Human> treeSetByLastName = new TreeSet<>(new HumanComparatorByLastName());
        treeSetByLastName.addAll(humans);
        System.out.println("\n5. TreeSet (comparator by last name, same last names dropped):\n"
                + treeSetByLastName);

        Set<Human> treeSetByAge = new TreeSet<>(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                return Integer.compare(h1.getAge(), h2.getAge());
            }
        });
        treeSetByAge.addAll(humans);
        System.out.println("\n6. TreeSet (anonymous comparator by age):\n" + treeSetByAge);
    }
}