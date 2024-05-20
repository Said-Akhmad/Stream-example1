package com.company;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        SortedSet<Person> set = new TreeSet<>();
        set.add(new Person("ASD", 36));
        set.add(new Person("ASD", 36));
        set.add(new Person("FFF", 34));
        set.add(new Person("RRRR", 25));
        set.add(new Person("ASD", 23));
        set.forEach(System.out::println);
    }
}
